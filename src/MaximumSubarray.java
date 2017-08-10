
public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int [] dp = new int[n];
        dp[0] = nums[0];
        int max = 0;
        for(int i=1;i<n;i++){
        	dp[i] = dp[i-1] + (dp[i-1]>0?dp[i-1]:0) ;
        	max = Math.max(dp[i], max);
        }
        return max;
    }
}
