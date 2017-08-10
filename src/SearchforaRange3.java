public class SearchforaRange3 {
	//分别在数组中找到等于target的最左边的数和最右边的数
	public int[] searchRange(int[] nums, int target) {
		int left = 0, right = nums.length - 1, mid;
		int[] ans = { -1, -1 };
		while (left < right) {
			mid = (left + right) / 2;
			if (nums[mid] < target)
				left = mid + 1;
			else right = mid ;
		}
		if(nums[left] != target) return ans;
		else ans[0] = left;
		
		left = 0;right = nums.length -1 ;
		while(left < right){
			mid = (left + right)/2 + 1;
			if(nums[mid] > target) right = mid - 1;
			else left = mid;
		}
		ans[1] = right;
		return ans;
	}
}
