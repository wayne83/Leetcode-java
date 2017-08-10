import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lenovo on 2016/12/16.
 */
public class Subsets {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        int n = nums.length;
        for(int i=0;i<=n;i++){
            loop(ans, temp, i, n, 1,nums);
        }
        return ans;
    }

    public void loop(List<List<Integer>> ans, List<Integer> temp, int k, int n, int z,int[] nums) {
        if (k == 0) {
            List<Integer> a = new ArrayList<>(temp);
            ans.add(a);
        } else {
            for (int j = z; j <= n; j++) {
                temp.add(nums[j-1]);
                loop(ans, temp, k-1, n, j+1,nums);
                temp.remove(temp.size() - 1);
            }
        }
    }
}
