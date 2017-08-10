
public class RegularExpressionMatching {
	public boolean isMatch(String s, String p) {
		 int sl = s.length() , pl = p.length();
		 boolean dp[][] = new boolean[sl+1][pl+1];
		 dp[0][0] = true;
		 for(int i=1;i<=sl;i++){
			 dp[i][0] = false;
		 }
		 for(int i=2;i<=pl;i+=2){
			 if( p.charAt(i-1) == '*'){
				 dp[0][i] = true;
			 }else{
				 break;
			 }
		 }
		 
		 for(int i=1;i<=sl;i++){
			 for(int j=1;j<=pl;j++){
				 if( p.charAt(j-1) != '*' ){
					 dp[i][j] = dp[i-1][j-1] && ( s.charAt(i-1) == p.charAt(j-1) || p.charAt(j-1) == '.' ); 
				 }else{
					 //dp[i][j] = ( dp[i-1][j-2] && (s.charAt(i-1)==p.charAt(j-2) || p.charAt(j-2) == '.' ) )  || (dp[i-1][j] &&(s.charAt(i-1)==p.charAt(j-2) || p.charAt(j-2) == '.') );
					 dp[i][j] = dp[i][j-2]  || (dp[i-1][j] &&(s.charAt(i-1)==p.charAt(j-2) || p.charAt(j-2) == '.') );
				 }
			 }
		 }
		 return dp[sl][pl];
	 }
	 
}
