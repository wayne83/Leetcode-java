public class ImplementstrStr {
	public int strStr(String haystack, String needle) {
		int ans = -1;
		int x = 0 , y = needle.length();
		int len = haystack.length();
		while(y <= len && ans != -1){
			String s = haystack.substring(x,y); 
			if(s.equals(needle)){
				ans = x;
			}
			x++;y++;
		}
		return ans;
	}
}
