
public class PalindromeNumber1 {
	public boolean isPalindrome(int x) {
		//该算法只比较字符串的一半
		
        if(x<0) return false;
        else{
            int res = 0;
            while(x>res){
                res = res*10 + x%10;
                x = x / 10;
            }
            return x == res || x == res/10;
        }
    }
}
