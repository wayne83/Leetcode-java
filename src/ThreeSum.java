import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ThreeSum {
	public List<List<Integer>> threeSum(int[] nums) {
		 List< List<Integer> > ans = new ArrayList<List<Integer>>();
			Arrays.sort(nums);
			int len = nums.length;	
			for(int i=0;i<len-2;i++){
				while(i<len-2 && i>0 && nums[i]== nums[i-1]){
					i++;
				}
				int m = i+1 , n = len-1;
				while(m < n){
					int sum = nums[m] + nums[n];
					int tar = -nums[i];
					if(sum < tar) m++;
					else if(sum > tar)n--;
					else{
						List<Integer> threesum = new ArrayList<Integer>();
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
			return ans;
    }
}
