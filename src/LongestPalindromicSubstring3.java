
public class LongestPalindromicSubstring3 {
	public String LongestString(String s){
		//动态规划求解
		int length = s.length();
		int[][] num = new int[length][length];
		
		int max = 0 , end = 0  ;
		for(int i=0;i<length;i++){
			num[i][i] = 1;
			end = i;
			if( i+1 < length && s.charAt(i) == s.charAt(i+1)){
				num[i][i+1] = 1;
				max = 2 ;
				end = i + 1;
			}
		}
		
		for(int len = 3 ; len<=length;len++){
			for(int i=0;i<=length-len;i++){
				int j = i + len - 1 ;
				if( num[i+1][j-1] == 1 && s.charAt(i) == s.charAt(j)){
					max = len ;
					num[i][j] = 1 ;
					end = j ;
				}
			}
		}
		return s.substring(end-max + 1,end+1);
	}
}
