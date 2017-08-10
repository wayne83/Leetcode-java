
public class MedianofTwoSortedArrays2 {
	
	 public double getkbybinary(int[] a , int astart , int[] b , int bstart , int k){
			if( astart > a.length - 1 ) return b[bstart + k - 1];
			if( bstart > b.length - 1 ) return a[astart + k - 1];
			if( k == 1) return Math.min(a[astart], b[bstart]);
			
			int mid = k/2 - 1 ;		
			int amid = Integer.MAX_VALUE , bmid = Integer.MAX_VALUE;
			if( astart + mid < a.length ) amid = a[ astart + mid] ;
			if( bstart + mid < b.length ) bmid = b[ bstart + mid] ;

			if( amid < bmid) return getkbybinary(a , astart + k/2  , b , bstart , k - k/2 );
			else return getkbybinary( a, astart , b , bstart + k/2 , k - k/2 );		
		}
		
		public double findMedianSortedArrays(int[] nums1, int[] nums2) {
			double ans = 0;
			int m = nums1.length, n = nums2.length;
			int l = (m + n + 1) >> 1;
			int r = (m + n + 2) >> 1;
			ans = ( (getkbybinary(nums1, 0 , nums2 , 0 , l) ) + ( getkbybinary(nums1 , 0 , nums2 , 0 , r) ) )/2;
			return ans;
		}
}
