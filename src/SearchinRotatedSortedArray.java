public class SearchinRotatedSortedArray {
	public int search(int[] nums, int target) {
		int len = nums.length;
		if (len == 0) {
			return -1;
		} else if (len == 1) {
			if (nums[0] == target)
				return 0;
			else
				return -1;
		} else {
			int left = 0, right = len - 1, ans;
			ans = searchloop(nums, target, left, right);
			return ans;
		}
	}

	public int searchloop(int[] nums, int target, int left, int right) {
		int ans = -1;
		if (left == right) {
			if (nums[left] == target)
				ans = left;
			else
				ans = -1;
		} else {
			int mid = (left + right) / 2;
			if (nums[mid] >= nums[left] && nums[mid] <= nums[right]) {
				ans = binarysearch(nums, target, left, right);
			} else if (nums[mid] >= nums[left]) {
				ans = binarysearch(nums, target, left, mid);
				if (ans == -1) {
					ans = searchloop(nums, target, mid + 1, right);
				}
			} else {
				ans = binarysearch(nums, target, mid, right);
				if (ans == -1) {
					ans = searchloop(nums, target, left, mid);
				}
			}
		}
		return ans;
	}

	public int binarysearch(int[] nums, int target, int left, int right) {
		int ans = -1, mid;
		while (left < right) {
			mid = (left + right) / 2;
			if (nums[mid] < target)
				left = mid + 1;
			else
				right = mid;
		}
		if (nums[left] == target) {
			ans = left;
		}
		return ans;
	}
}
