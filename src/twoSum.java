import java.util.HashMap;
import java.util.Scanner;


public class twoSum {
	public static int[] sum(int nums[],int target){
		HashMap m = new HashMap();
		int[] ans = new int[2];
		for(int i=0;i<nums.length;i++){
			m.put(nums[i], i);
		}
		for(int i=0;i<nums.length;i++){
			Integer v ;
			v = (Integer) m.get(target-nums[i]);
			if(v != null && v != i){
				return  new int[]{i,v};
			}
		}
		throw new RuntimeException();
	}
	
	public static void main(String[] args){
		int n ,target;
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		int[] nums = new int[n];
		for(int i = 0; i<n;i++){
			nums[i] = input.nextInt();
		}
		target = input.nextInt();
		int[] ans = new int[2];
		ans = sum(nums,target);
		System.out.println(ans[0] + " " + ans[1]);
	}
	
}
