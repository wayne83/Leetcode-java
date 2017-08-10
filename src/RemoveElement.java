public class RemoveElement {
	public int removeElement(int[] nums, int val) {
		int ans = 0;
		for (int n : nums) {
			if (n != val) {
				nums[ans++] = n;
			}
		}
		return ans;
	}
}
