import java.util.*;
public class TrappingRainWater {
	public int trap(int[] height) {
		int ans = 0;
		int left,right, length = height.length , k = 0 , cz,min;
		for(int i=1;i<length;i++){
			cz = height[i];
			if(height[i-1] >= cz){
				left = i-1;
				right = findRightMax(i,height,height[left]);
				//System.out.println("left:" + left + " right:" + right);
				if(right != - 1){
					min = height[left] < height[right]? height[left]:height[right];
					for(int j=left+1;j<right;j++){
					    if(min > height[j])
						    ans += min - height[j];
					}
					i = right ;
				}	
			}
		}
		return ans;
	}
	
	private int findRightMax(int x,int[] nums,int zhi){
		int max = 0 , flag = -1,n = nums.length;
		for(int i=x+1;i<n;i++){
			if(nums[i] > max ){
				max = nums[i];
				flag = i ;
			}
			if( max >= zhi ){
				break;
			}
		}
		return flag;
	}
	
	
	
}
