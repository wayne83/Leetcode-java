
public class LongestCommonPrefix2 {
	public String longestCommonPrefix(String[] strs) {
		int lens = strs.length;
		if(lens == 0 ) return "";
		String ans = strs[0];
		for(int i=1;i<lens;i++){
			while(strs[i].indexOf(ans) != 0 ){
				ans = ans.substring(0,ans.length()-1);
			}
		}
		return ans;
	}
}
