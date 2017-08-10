import java.util.Scanner;
public class Sort1 {
	public static int[] merge(int[] a, int[] b){
		int alen = a.length;
		int blen = b.length;
		int i=0 , j = 0 ,z = 0;
		int c[] = new int[alen+blen];
		while(i < alen || j < blen ){
			if((i < alen) && (j > blen-1 ||  a[i] < b[j])  ){
				c[z] = a[i];
				i++;
			}else{
				c[z]=b[j];
				j++;
			}
			z++;
		}
		return c;	
	}
	
	public static int[] sort(int a[]){
		int alen = a.length;
		if(alen == 0 || alen == 1)
			return a;
		else{
			int mid = alen/2;
			int x[] = new int[mid];
			int y[] = new int[alen-mid];
			for(int i=0;i<mid;i++){
				x[i] = a[i];
			}
			for(int j=0;j<alen-mid;j++){
				y[j] = a[mid+j];
			}
			x = sort(x);
			y = sort(y);
			return merge(x , y); 
		}
	}
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++){
			a[i] = input.nextInt();
		}
		int[] ans = sort(a);
		for(int i=0;i<n;i++){
			System.out.println(ans[i]);
		}
}
	
	
}
