import java.util.ArrayList;
import java.util.List;

public class GrayCode {
	public List<Integer> grayCode(int n) {
		List<Integer> ans = new ArrayList<Integer>();
		ans.add(0);
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < Math.pow(2, i - 1); j++) {
				ans.add((int) Math.pow(2, i - 1)
						+ ans.get((int) Math.pow(2, i - 1) - 1 - j));
			}
		}
		return ans;
	}
}
