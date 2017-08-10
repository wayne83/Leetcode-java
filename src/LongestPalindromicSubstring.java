
public class LongestPalindromicSubstring {
	public String LongestString(String s){
		//把字符串倒置，利用动态规划寻找两个字符串中最大相同子串
		
		int length = s.length();
		int[][] num = new int[length][length];
		String uns = "" ;
		for(int i=length-1;i>=0;i--){
			uns += s.charAt(i);
		}
		for(int i=0;i<=length;i++){
			for(int j=0;j<=length;j++){
					num[i][j] = 0;
				}
			}
		int max = 0, x=0 ;
		String ans = null;
		for(int i=1;i<=length;i++){
			for(int j=1;j<=length;j++){
				if( s.charAt(i-1) == uns.charAt(j-1)  ){
					num[i][j] = num[i-1][j-1] + 1;
				}
				
				if(max < num[i][j]){
					max = num[i][j];
					x = i;
				}
			}
		}
		ans = s.substring(x-max,x);
		return ans;
	}
}
