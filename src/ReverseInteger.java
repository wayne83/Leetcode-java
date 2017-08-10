
public class ReverseInteger {
	public int reverse(int x) {
        int ans = 0;
        while( x != 0){
            if( (ans > 214748364) || (ans == 214748364 && x > 7) || (ans < -214748364) || (ans == -214748364 &&  x<-8) ){
                return 0;
            }
            ans = ans*10 + x%10;
            x = x/10;
        }
        return ans;
    }
}
