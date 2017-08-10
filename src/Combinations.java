import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lenovo on 2016/12/16.
 */
public class Combinations {


    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        loop(ans, temp, k, 1, n, 1);
        return ans;
    }

    public void loop(List<List<Integer>> ans, List<Integer> temp, int k, int i, int n, int z) {
        if (i > k) {
            List<Integer> a = new ArrayList<>(temp);
            ans.add(a);
        } else {
            for (int j = z; j <= n; j++) {
                temp.add(j);
                loop(ans, temp, k-1, i + 1, n, j+1);
                temp.remove(temp.size() - 1);
            }
        }
    }
}

