import java.util.ArrayList;
import java.util.List;

//运算时间为3ms

public class DivideTwoIntegers1 {
	 public int divide(int dividend, int divisor) {
			long ans = dividelong(dividend,divisor);
			return ans > Integer.MAX_VALUE ? Integer.MAX_VALUE : (int)ans;
		}
		
		public long dividelong(long dividend,long divisor){
			Boolean flag = true;
			if ((dividend < 0 && divisor > 0) || (dividend > 0 && divisor < 0)) {
				flag = false;
			}
			dividend = dividend < 0 ? -dividend : dividend;
			divisor = divisor < 0 ? -divisor : divisor;
			long sum;
			long ans;
			if (dividend < divisor)
				return 0;
			else {
				sum = divisor;
				ans = 1;
				while (sum<<1 < dividend) {
				    sum = sum << 1;
					ans = ans << 1;
				}
				ans = ans + dividelong(dividend - sum, divisor);
			}
			if (flag)
				return ans;
			else
				return  -(ans);
		}
}
