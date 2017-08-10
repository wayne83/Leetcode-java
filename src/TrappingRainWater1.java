import java.util.*;

public class TrappingRainWater1 {
	public int trap(int[] height) {
		int ans = 0;
		int l=0,r=height.length-1,level = 0,lower;
		while(l<r){
			lower = height[ height[l]<height[r]?l++:r-- ];
			level = level < lower ? lower : level;
			ans += level - lower;
		}
		return ans;
	}
}
