
public class ZigZagConversion {
	public String convert(String s, int numRows) {
        if(numRows == 1) return s;
        else{
            String[] ans = new String[numRows];
            for(int i=0;i<numRows;i++){
                ans[i] = "";
            }
            int j = 0;
            boolean flag = true;
            for(int i=0;i<s.length();i++){
                ans[j] = ans[j] + s.charAt(i);
                if(flag == true){
                    j++;
                }else{
                    j--;
                }
                if(j == numRows - 1 || j == 0){
                    flag = !flag;
                }
            }
            for(int i=1;i<numRows;i++){
                ans[0] = ans[0] + ans[i];
            }
            return ans[0];
        }
       
    }
}
