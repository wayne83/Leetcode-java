public class LongestValidParentheses2 {
	public int longestValidParentheses(String s) {
		int max = 0, left = 0, len = s.length(),temp = 0 , right = 0;
		int[] ans = new int[len];
		int[] leftans = new int[len+10];
		for(int i=0;i<len;i++){
			if(s.charAt(i) == '('){
				left++;
			}
			else{
				if(left!=0){
					ans[i] = ans[i-1] + 2 + (i-2-ans[i-1]>0 ? ans[i-2-ans[i-1]] :0);
					if(ans[i] > max) max = ans[i];
					left--;
				}
			}
		}
		return max;
	}
}
