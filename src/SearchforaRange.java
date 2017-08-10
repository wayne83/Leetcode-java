public class SearchforaRange {
	public int[] searchRange(int[] nums, int target) {
		int left = 0 , right = nums.length-1,mid;
		while(left <= right){
			mid = (left + right)/2;
			if(nums[mid] <= target) left = mid + 1;
			if(nums[mid] >= target)	right = mid - 1;
		}
		if(left - right == 2){
			mid = (left + right)/2;
			int x = mid;
			while(x>=0 && nums[x]==target){
				left = x;
				x--;
			}
			x = mid;
			while(x<=nums.length-1 &&  nums[x]==target){
				right = x;
				x++;
			}
		}else{
			left = right = -1;
		}
		int[] ans =  {left , right};
		return ans;
	}
}
