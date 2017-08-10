
public class LongestPalindromicSubstring2 {
	public String LongestString(String s){
		//把字符串倒置，寻找两个字符串中最大相同子串
		
		int length = s.length();
		String uns = "" ;
		for(int i=length-1;i>=0;i--){
			uns += s.charAt(i);
		}
		
		int max = 0 , end = 0 ;
		for(int i=0;i<2*length;i++){
			int str1_start = 0 , str2_start = 0;
			if(i < length){
				str1_start = length - i;
			}else{
				str2_start = i -length;
			}
			int cur = 0;
			for(int j=0;(str1_start + j < length)&&(str2_start + j <length);j++){
				if(s.charAt(str1_start + j) == uns.charAt(str2_start + j)){
					cur++;
				}else{
					if(cur > max){
						max = cur;
						end = str1_start + j ;
					}
					cur = 0;
				}
				if(cur > max){
					max = cur;
					end = str1_start + j ;
				}
			}
		}
		return s.substring(end-max+1,end+1);
	}
}
