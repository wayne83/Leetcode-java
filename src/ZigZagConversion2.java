
public class ZigZagConversion2 {
	public String convert(String s, int numRows) {
		if(numRows == 1) return s;
		else{
			int cycle = 2*numRows - 2;
			String ans = "";
			for(int i=0;i<numRows;i++){
				for(int j = i;j<s.length();j+= cycle){
					ans = ans + s.charAt(j);
					int secondj = (j-i) + cycle - i ;
					if(secondj < j + cycle && secondj != j ){
						ans = ans + s.charAt(secondj);
					}
				}
			}
			return ans;
		}
	}
}
