import java.util.HashMap;
import java.util.Scanner;


public class LongestSubstringWithoutRepeatingCharacters {
	public static int lengthOfLongestSubstring(String s){
		//注释中表示使用hash表，但运行速度为31ms，使用数组，运行速度为5ms；
		
		int step;
		int[] temp = new int[256];
		for(int i=0;i<256;i++){
			temp[i] = -1;
		}
		//HashMap<Character,Integer> hash = new HashMap<Character,Integer>();
		
		int now = 0 , max = 0 ,index=0 , dd = 0;
		/*for(int i=0;i<s.length();i++){
			if( ( hash.get(s.charAt(i) ) == null ) || ( hash.get(s.charAt(i)) < dd ) ){
				hash.put(s.charAt(i) , i);
				now++;
			}else{
				index = hash.get(s.charAt(i));
				dd = index ;
				now = i-index;
				hash.put(s.charAt(i) , i);
			}*/
		for(int i=0;i<s.length();i++){
			step = s.charAt(i)  ;
			if(temp[step] == -1 || temp[step] < dd){
				temp[step] = i ;
				now++;
			}else{
				index = temp[step] ;
				dd = index;
				now = i -index;
				temp[step] = i ;
			}
			max = (max > now)?max:now;
		}
		return max;
	}
	
	public static void main(String[] args){
		String s ;
		Scanner input = new Scanner(System.in);
		s = input.nextLine();
		int ans = lengthOfLongestSubstring(s);
		System.out.println(ans);
	}
}
