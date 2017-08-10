import java.util.*;
public class JumpGameII {
	public int jump(int[] nums) {
		int ans = 0 , path = 0 , n = nums.length,temp;
		while(path < n-1 && n > 1){
			int max = 0,k=0;
			if( path + nums[path] < n-1){
				for(int i=1;i<=nums[path];i++){
					temp = path + i + nums[path+i];
					if(max < temp){
						max = temp;
						k = path + i;
					}
				}
				path = k;
			}else{
				path = path+nums[path];
			}
			ans++;
		}
		return ans;
    }
}
