import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;


public class FourSum {
	public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        int len = nums.length;
        for(int i=0;i<len-3;i++){
        	List<List<Integer>> list = new ArrayList<List<Integer>>();
			while(i<len-2 && i>0 && nums[i]== nums[i-1]){
				i++;
			}
			int [] newnums = new int[len-i-1];
			for(int j=0;j<newnums.length;j++){
				newnums[j] = nums[j+i+1];
			}
			threeSum(newnums,target-nums[i],nums[i], ans);
        }
        return ans;
    }
	
	public void threeSum(int[] nums,int target,int x,List<List<Integer>> ans){
		int len = nums.length;	
		for(int i=0;i<len-2;i++){
			while(i<len-2 && i>0 && nums[i]== nums[i-1]){
				i++;
			}
			int m = i+1 , n = len-1;
			while(m < n){
				int sum = nums[m] + nums[n];
				int tar = target-nums[i];
				if(sum < tar) m++;
				else if(sum > tar)n--;
				else{
					List<Integer> threesum = new ArrayList<Integer>();
					threesum.add(x);
					threesum.add(nums[i]);
					threesum.add(nums[m]);
					threesum.add(nums[n]);
					ans.add(threesum);
					while(m<n && nums[m]==nums[m+1]) m++;
					while(m<n && nums[n]==nums[n-1]) n--;
					m++;n--;
				}
			}
		}
	}
}
