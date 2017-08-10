
public class JumpGame {
	public boolean canJump(int[] nums) {
        int m = nums.length;
        int max = 1;
        for(int i=0;i<m;i++){
        	if(max >= (i+1) ){
        		if( max < (nums[i] + i + 1) ){
            		max = nums[i] + i + 1;
            	}
        		if( max >= m){
        			return true;
        		}
        	}else{
        		return false;
        	}
        	
        }
        return false;
    }
}
