
public class LongestCommonPrefix {
	public String longestCommonPrefix(String[] strs) {
        int lens = strs.length , num = 0;
        String ans = "" ;
        boolean flag = true , same = false;
        while(flag && lens !=0){
        	char nowchar = strs[0].charAt(num);
        	same = true ;
        	for(int i=1;i<lens;i++){
        		if(num >= strs[i].length() || strs[i].charAt(num) != nowchar ){
        			flag = false;
        			same = false;
        		}
        	}
        	if(same){
        		ans = ans + nowchar;
        	}
        }
        return ans;
    }
}
