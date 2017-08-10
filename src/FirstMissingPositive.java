import java.util.*;
public class FirstMissingPositive {

	public static int firstMissingPositive(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n+2];
        for(int i=0;i<n;i++){
        	if( nums[i] <= n && nums[i] > 0  ){
        		ans[nums[i]] = 1;
        	}
        }
        
        int j = 1;
        for(int i=1;i<=n+1;i++){
        	if(ans[i] == 0 ){
        		j = i;
        		break;
        	}
        }
        return j;
    }
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++){
			a[i] = input.nextInt();
		}
		System.out.println( firstMissingPositive(a) );
	}
	
}
