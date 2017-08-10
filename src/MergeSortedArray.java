
public class MergeSortedArray {
	public void merge(int[] nums1,int m ,int[] nums2, int n){
		int i=m-1,j=n-1,z=m+n-1;
		while(i>=0 && j>=0){
			if(nums1[i] > nums2[j]){
				nums1[z] = nums1[i];
				i--;
				z--;
			}else{
				nums1[z] = nums2[j];
				j--;
				z--;
			}
		}
		for(int k=i;k>=0;k--){
			nums1[z] = nums1[k];
			z--;
		}
		for(int k=j;k>=0;k--){
			nums1[z] = nums2[k];
			z--;
		}
	}
}
