
public class PalindromeNumber {
	public boolean isPalindrome(int x) {
        if(x<0) return false;
        else{
            int res = 0 , s = x;
            do{
                res = res*10 + x%10;
                x = x / 10;
            }while(x>0);
            return s == res;
        }
    }
}
