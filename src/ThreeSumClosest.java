import java.util.Arrays;

public abstract class ThreeSumClosest {
	public int threeSumClosest(int[] nums, int target) {
		int ans = target;
		int dis = Integer.MAX_VALUE;
		Arrays.sort(nums);
		int len = nums.length;
		for (int i = 0; i < len - 2; i++) {
			int m = i + 1, n = len - 1;
			while (m < n) {
				int sum, tar = target - nums[i];
				sum = nums[m] + nums[n];
				if (sum < tar) {
					if (tar - sum < dis) {
						ans = sum + nums[i];
						dis = tar - sum;
					}
					m++;
				}else if (sum > tar) {
					if (sum - tar < dis) {
						ans = sum + nums[i];
						dis = sum - tar;
					}
					n--;
				}else {
					return target;
				}
			}

		}
		return ans;
	}
}
