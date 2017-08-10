public class SearchInsertPosition {
	public int searchInsert(int[] nums, int target) {
		int left = 0, right = nums.length - 1, mid ;
		while(left < right){
			mid = (left + right)/2;
			if(nums[mid] < target) left = mid + 1;
			else right = mid;
		}
		if(target > nums[nums.length-1])return nums.length;
		else return left;
	}
}
