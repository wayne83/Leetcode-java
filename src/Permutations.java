import java.util.ArrayList;
import java.util.List;


public class Permutations {

public List<List<Integer>> permute(int[] nums) {
        
		List<List<Integer>> ans = new ArrayList<List<Integer>>();
		List<Integer> now = new ArrayList<Integer>();
		List<Integer> array = new ArrayList<Integer>();
		for(int i=0;i<nums.length;i++){
			array.add(nums[i]);
		}
		//System.out.println("array:" + array.size());
		small_permute(ans,now,array);
		return ans;
    }
	
	
	public static void small_permute(List<List<Integer>> ans,List<Integer> now , List<Integer> array){
		
		if(array.size() == 1){
		    now.add(array.get(0));
			ans.add(now);
		}else{
		        //System.out.println("size:" + array.size());
				for(int i=0;i<array.size();i++){
					now.add(array.get(i));
					List<Integer> arrays = new ArrayList<Integer>();
					List<Integer> nows = new ArrayList<Integer>();
					arrays.addAll(array);
					arrays.remove(i);
					nows.addAll(now);
					small_permute(ans,nows,arrays);
					int num = now.size()-1;
					now.remove(num);
					//System.out.println("arrays:" + now);
				}
		}
		
	}
	
}
