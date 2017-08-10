
public class MultiplyStrings1 {
	public String multiply(String num1, String num2) {
		int m , n , p1 , p2 , mul ;
		m = num1.length(); n = num2.length();
		int[] pos = new int[m+n];
		for(int i=m-1;i>=0;i--){
			for(int j=n-1;j>=0;j--){
				mul = (num1.charAt(i)-'0') * (num2.charAt(j) - '0');
				p1 = i+j; p2 = i+j+1;
				int sum = pos[p2] + mul;
				
				pos[p2] = sum%10 ;
				pos[p1] += sum/10 ;
			}
		}
		StringBuffer ans = new StringBuffer();
		for(int i=0;i<m+n;i++){
			if(!(ans.length() == 0 && pos[i] == 0)){
				ans.append(pos[i]);
			}
		}
		return ans.toString();
	}
}
