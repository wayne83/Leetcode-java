public class LongestValidParentheses1 {
	public int longestValidParentheses(String s) {
		int max = 0, left = 0, len = s.length();
		int[] ans = new int[len];
		for(int i=0;i<len;i++){
			if(s.charAt(i) == '('){
				left++;
			}
			else{
				if(left!=0){
					ans[i] = ans[i-1] + 2 + (i-1-ans[i-1]>0 ? ans[i-1-ans[i-1]] :0);
					if(ans[i] > max) max = ans[i];
					left--;
					if(i+1<len && s.charAt(i+1) == '('){
						ans[i+1] = ans[i++];
						left++;
					}
				}
			}
		}
		return max;
	}
}
