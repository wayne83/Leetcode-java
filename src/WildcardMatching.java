
public class WildcardMatching {

	public boolean isMatch(String s, String p) {
		int sl = s.length() , pl = p.length();
        boolean ans[][] = new boolean[sl+1][pl+1];
        ans[0][0] = true;
        for(int i=1;i<=sl;i++){
        	ans[i][0] = false;
        }
        for(int i=1;i<=pl;i++){
        	if(p.charAt(i-1) == '*'){
        		ans[0][i] = true;
        	}else{
        		break;
        	}
        }
        
        for(int i=1;i<=sl;i++){
        	for(int j=1;j<=pl;j++){
        		if(p.charAt(j-1) != '*'){
        			ans[i][j] = ans[i-1][j-1] && (s.charAt(i-1) == p.charAt(j-1) || p.charAt(j-1) == '?');
        		}else{
        			ans[i][j] = ans[i-1][j] || ans[i][j-1];
        		}
        	}
        }
        return ans[sl][pl];
    }
}
