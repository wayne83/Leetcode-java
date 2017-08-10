import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class PermutationsII {

public List<List<Integer>> permuteUnique(int[] nums) {
	List<List<Integer>> list = new ArrayList<List<Integer>>();
	Arrays.sort(nums);
	backtrace(list,new ArrayList<Integer>() ,nums, new boolean[nums.length]);
	return list;
}

public static void backtrace(List<List<Integer>> list, List<Integer> templist , int[] nums, boolean[] used){
	if(templist.size() == nums.length){
		list.add( new ArrayList<>(templist) );
	}else{
		for(int i=0;i<nums.length;i++){
			if(used[i] || i>0 && nums[i] == nums[i-1] && !used[i-1]) continue;
			templist.add(nums[i]);
			used[i] = true;
			backtrace(list,templist,nums,used);
			used[i] = false;
			templist.remove(templist.size()-1);
		}
	}
}

}
