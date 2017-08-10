import java.util.Scanner;


public class Sort {
	//折半排序和归并排序算法
	
	public static int[] sorted(int nums[]){
		int[] ans = new int[nums.length];
		int position;
		for(int i=0;i<nums.length;i++){
			position = findPosition(ans,nums[i],i);
			for(int j = i - 1 ; j >= position  ; j-- ){
				ans[j + 1] = ans[j];
			}
			ans[position] = nums[i];
		}
		return ans;
	}
	public static int findPosition(int nums[],int num,int lens){
		int left = 0 , right = lens - 1 ;
		int mid = 0;
		while(left <= right){
			mid = (left + right)/2;
			if(nums[mid] <= num){
				left = mid + 1 ;
			}else{
				right = mid - 1;
			}
		}
		return right + 1;
	}
	
	public static int[] Merge(int[] a , int alens , int[] b , int blens){
		int i = 0 , j = 0 , num = 0;
		int[] ans = new int[alens + blens];
		while( i<alens && j<blens){
			if(a[i] < b[j]){
				ans[num] = a[i];
				i++;
			}else{
				ans[num] = b[j];
				j++;
			}
			num++;
		}
		if(i == alens){
			while(j<blens){
				ans[num] = b[j];
				num++;
				j++;
			}
		}else{
			while(i<alens){
				ans[num] = a[i];
				num++;
				i++;
			}
		}
		return ans;	
	}
	public static int[] Mergepass(int[] num ,int lens){
		if(lens == 0 || lens == 1) return num;
		else{
			int mid = lens/2;
			int[] a = new int[mid];
			int[] b = new int[lens - mid];
			for(int i=0;i<mid;i++){
				a[i] = num[i];
			}
			for(int i=0;i<lens-mid;i++){
				b[i] = num[mid + i];
			}
			a = Mergepass(a,mid);
			b = Mergepass(b,lens-mid);
			return Merge(a,mid,b,lens-mid); 
		}
	}
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		//int m = input.nextInt();
		int a[] = new int[n];
		//int b[] = new int[m];
		for(int i=0;i<n;i++){
			a[i] = input.nextInt();
		}
		//for(int i=0;i<m;i++){
		//	b[i] = input.nextInt();
		//}
		//int[] ans = Merge(a,a.length,b,b.length);
		int[] ans = Mergepass(a,a.length);
		for(int i=0;i<n;i++){
			System.out.println(ans[i]);
		}
}
}
