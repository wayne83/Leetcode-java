

public class NextPermutation {
	public void nextPermutation(int[] nums) {
		int num = nums.length - 1;
		while (num > 0 && nums[num] <= nums[num-1]) {
				num--;
		}
		Change(num, nums);
	}
	public void Change(int num, int[] nums) {
		int len = nums.length;
		int left = num, right = len - 1;
		int target;
		if (num > 0) {
			int changei = len - 1;
			int changenum = nums[num - 1];
			while (nums[changei] <= changenum) {
				changei--;
			}
			target = nums[changei];
			nums[changei] = changenum;
			nums[num - 1] = target;
		}
		while (left < right) {
			target = nums[left];
			nums[left] = nums[right];
			nums[right] = target;
			left++;
			right--;
		}
	}
}
