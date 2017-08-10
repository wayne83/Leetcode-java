
public class LongestPalindromicSubstring4 {
	public String LongestString(String s){
		//从一个字符向两边扩展，注意区别奇和偶
		
		int length = s.length();
		int start=0 , end=0;
		int position=0, max = 0,len;
		for(int i=0;i<length;i++){ //子串为奇数时
			len = 0;
			start = i-1;
			end = i + 1;
			max = 1;
			position = i;
			while(start >= 0 && end < length && s.charAt(start) == s.charAt(end)){
				len = end - start + 1;
				start-=1;
				end+=1;
			}
			if(max < len){
				max = len ;
				position = start + 1;
			}
		}
		for(int i=0;i<length;i++){ //子串为偶数时
			start = i ;
			end = i + 1;
			while( start >= 0 && end < length &&  s.charAt(start) == s.charAt(end)){
				if(end-start+1 > max){
					max = end -start +1;
					position = start;
				}
				start-=1;
				end+=1;
			}
		}
		return s.substring(position,position+max);
	}
}
