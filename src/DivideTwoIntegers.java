import java.util.ArrayList;
import java.util.List;

//运算时间为2ms
public class DivideTwoIntegers {
	public int divide(int dividend, int divisor) {
		long dividend0 = dividend, divisor0 = divisor;
		Boolean flag = true;
		if ((dividend < 0 && divisor > 0) || (dividend > 0 && divisor < 0)) {
			flag = false;
		}
		dividend0 = dividend0 < 0 ? -dividend0 : dividend0;
		divisor0 = divisor0 < 0 ? -divisor0 : divisor0;
		long sum;
		long ans;
		if (dividend0 < divisor0)
			return 0;
		else {
			sum = divisor0;
			ans = 1;
			while (sum<<1 < dividend0) {
			    sum = sum << 1;
				ans = ans << 1;
			}
			int cha = (int) (dividend0 - sum);
			ans = ans + divide(cha, (int) divisor0);
		}
		if (flag)
			return (int) (ans > Integer.MAX_VALUE ? Integer.MAX_VALUE : ans);
		else
			return (int) -(ans);
	}
}
