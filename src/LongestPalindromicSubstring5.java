
public class LongestPalindromicSubstring5 {
	public String LongestString(String s){
		//时间复杂度为O(n)的算法
		
		
		int length = s.length();
		String n = "";
		for(int i=0;i<length;i++){
			n = n + "#" + s.charAt(i);
		}
		n = n + "#";
		
		int[] p = new int[3*length];
		int boundary = 0 , id = 0 ,maxlen = 0 , position = 0;
		for(int i=1;i<n.length();i++ ){
			int k = 2 * id - i;
			if(boundary > i ){
				p[i] = Math.min(p[k], boundary - i);
			}else{
				p[i] = 1;
			}
			while(i-p[i] >=0 && i+p[i] < n.length() && n.charAt(i-p[i]) == n.charAt(i+p[i]) ){
				p[i]++;
			}
			
			if( i + p[i] > boundary){
				boundary = i + p[i];
				id = i ;
			}
			
			if( maxlen < p[i] ){
				maxlen = p[i];
				position = i ;
			}
		}
		return n.substring( position - maxlen  + 1 , position - maxlen  + 1 + 2 * maxlen - 1).replace("#","");
	}
}
