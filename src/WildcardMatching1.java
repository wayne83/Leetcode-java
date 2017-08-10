
public class WildcardMatching1 {

	public boolean isMatch(String s, String p) {
		int sl = s.length() , pl = p.length() , i=0 , j=0;
		int start = -1 , s_start = 0;
		while(i < sl){
			if(i<sl && j <pl &&  ( s.charAt(i)==p.charAt(j) || p.charAt(j) == '?'  )){
				i++;j++;
			}else if(p.charAt(j) == '*'){
				start = j;
				s_start = i;
				j++;
			}else if(start != -1){
				j = start + 1;
				s_start++;
				i = s_start;
			}else{
				return false;
			}
		}
		while(j<pl && p.charAt(j) == '*'){
			j++;
		}
		return j == pl;
	}
}
