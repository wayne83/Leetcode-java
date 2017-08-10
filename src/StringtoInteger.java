
public class StringtoInteger {
	public int myAtoi(String str) {
        int i = 0 , ans = 0 , fh = 1;
        str = str.trim();
        if(i<str.length() && str.charAt(i) == '-' ){
            fh = -1;
            i++;
        }else if(i<str.length() &&  str.charAt(i) == '+'){
            i++;
        }
        int INT_MAX = 2147483647 ,INT_MIN =-2147483648;
        while( i<str.length() &&  str.charAt(i) - '0' <= 9 && str.charAt(i) - '0' >= 0 ){
            if(fh == 1 && ans > (INT_MAX - (str.charAt(i)-'0'))/10 )
                return INT_MAX;
            else if(fh == -1 && ( ans > INT_MAX/10 || ans == INT_MAX/10 && str.charAt(i)-'0' == 9 ) ){
                return INT_MIN;
            }
            else{
                ans = ans*10 + ( str.charAt(i) - '0' );
                i++;   
            }
        }
        return ans*fh;
        
    }
}
