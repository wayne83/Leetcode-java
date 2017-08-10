import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lenovo on 2016/12/15.
 */
public class PermutationSequence {

    public String getPermutation(int n, int k) {
        int[] array = new int[n+1];
        List<Integer> numbers = new ArrayList<>();
        int sum = 1;
        array[0] = 1 ;
        for(int i=1;i<=n;i++){
            sum*=i;
            array[i] = sum;
            numbers.add(i);
        }

        int index;
        String ans = "";
        for(int i=1;i<=n;i++){
            if(k>=1) {
                index = (k - 1) / array[n - i];
                ans += String.valueOf(numbers.get(index));
                numbers.remove(index);
                k = k - index * array[n - i];
            }else{
                ans+=String.valueOf( numbers.get(0) );
            }
        }
        return ans;
    }

}
