import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {
	public List<List<Integer>> combinationSum(int[] candidates, int target) {
		Arrays.sort(candidates);
		return find(candidates,target,0,candidates.length-1);
	}

	public List<List<Integer>> find(int[] candidates, int target,
			int left, int right) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		for (int i = left; i <= right; i++) {
			if (candidates[i] > target) {
				return list;
			} else if (candidates[i] == target) {
			    List<Integer> l = new ArrayList<Integer>();
				l.add(candidates[i]);
				list.add(l);
			} else {
				List<List<Integer>> temp = new ArrayList<List<Integer>>();
				temp = find(candidates, target - candidates[i], i,right);
				if (!temp.isEmpty()) {
					for (List<Integer> j : temp) {
					    List<Integer> s = new ArrayList<Integer>();
						s.add(candidates[i]);
						for(int k : j){
							s.add(k);
						}
						list.add(s);
					}
				}
			}
		}
		return list;
	}
}
