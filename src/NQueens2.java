import java.util.Arrays;

/**
 * Created by Lenovo on 2016/12/15.
 */
public class NQueens2 {

    private int[] columns;
    private int[] lup;
    private int[] rup;
    private int ans;
    public int totalNQueens(int n) {

        columns = new int[n];
        lup = new int[2*n];
        rup = new int[2*n];
        ans = 0;
        loop(n,0);
        return ans;
    }

    public void loop(int n ,int i){
        if(i>=n){
            ans++;
        }else{
            for(int j=0;j<n;j++){
                if(columns[j]==0 && lup[i-j+n]==0 && rup[i+j]==0){
                    columns[j] = lup[i-j+n] = rup[i+j] =1 ;
                    loop(n,i+1);
                    columns[j] = lup[i-j+n] = rup[i+j] =0 ;
                }
            }
        }

    }
}
