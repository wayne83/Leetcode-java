public class LongestValidParentheses {
	public int longestValidParentheses(String s) {
		int max = 0, left = 0, len = s.length();
		int[] ans = new int[len];
		int[] leftans = new int[len+10];
		for(int i=0;i<len;i++){
			if(s.charAt(i) == '('){
				leftans[++left] = 0;
			}
			else{
				if(left!=0){
					ans[i] = ans[i-1] + 2 + leftans[left];
					if(ans[i] > max) max = ans[i];
					left--;
					if(i+1<len && s.charAt(i+1) == '('){
						leftans[++left] = ans[i++];
					}
				}else{
					ans[i] = 0 ;
				}
			}
		}
		return max;
	}
}
