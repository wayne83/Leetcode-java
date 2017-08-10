import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
	public List<String> generateParenthesis(int n) {
		List<String> ans = new ArrayList<String>();
		if (n == 0)
			return ans;
		else {
			getCom(ans, 1, n-1, 1, 2*n, "(");
		}
		return ans;
	}
	public void getCom(List<String> ans, int left, int n, int num, int sum,
			String str) {
		if (num == sum) {
			ans.add(str);
		} else {
			if (left == 0) {
				getCom(ans, left+1, n-1, num+1, sum, str+"(");
			} else if (n == 0) {
				getCom(ans, left-1, n, num+1, sum, str+")");
			} else {
				getCom(ans, left-1, n, num+1, sum, str+")");
				getCom(ans, left+1, n-1, num+1, sum, str+"(");
			}
		}
	}
}
