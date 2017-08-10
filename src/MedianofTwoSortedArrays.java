
public class MedianofTwoSortedArrays {
	public double median(int[] nums1, int[] nums2 ){
		//归并计数法，时间复杂度为O（m+n）
		double ans = 0;
		int n = nums1.length , m = nums2.length , sum;
		sum = n + m ;
		int j1 = 0 , j2 = 0;
		int[] sums = new int[sum];
		for(int i=0;i<sum;i++){
			if(j1 <= n-1 && j2 <= m-1){
				if(nums1[j1] <= nums2[j2]){
					sums[i] = nums1[j1];
					j1++;
				}else{
					sums[i] = nums2[j2]; 
					j2++;
				}
			}else if(j1 <= n-1){
				sums[i] = nums1[j1];
				j1++;
			}else if(j2 <= m-1){
				sums[i] = nums2[j2];
				j2++;
			}
		}
		if(sum == 1)
		{
		    return sums[0];
		}else{
		    ans = sums[sum/2];
		    if(sum % 2 == 0){
			    ans = ( ans + sums[sum/2 - 1] ) / 2;
		    }   
		}
		return ans;
	}
}
