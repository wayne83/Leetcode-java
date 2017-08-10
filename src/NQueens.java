import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lenovo on 2016/12/14.
 */

public class NQueens {

    private int[] columns;
    private int[] lup;
    private int[] rup;
    public List<List<String>> solveNQueens(int n){

        List<List<String>> ans = new ArrayList<>();
        List<String> queens = new ArrayList<>();
        columns = new int[n];
        lup = new int[2*n];
        rup = new int[2*n];
        loop(ans,queens,n,0);
        return ans;
    }

    public void loop(List<List<String>> ans, List<String> q,int n , int i){
        if(i>=n){
            List<String> a = new ArrayList<>(q);
            ans.add(a);
        }else{

            //List<String> temp = new ArrayList<>(q);
            for(int j=0;j<n;j++){
                if( columns[j] == 0 && lup[i+j]==0 && rup[i-j+n]==0 ){
                    String s = "";
                    for(int z=0;z<n;z++){
                        if(z == j){
                            s+="Q";
                        }else{
                            s+='.';
                        }
                    }
                    q.add(i,s);
                    columns[j] = lup[i+j] = rup[i-j+n] = 1;
                    loop(ans,q,n,i+1);
                    //List<String> x = new ArrayList<>(temp);
                    //q = x;
                    q.remove(i);
                    columns[j] = lup[i+j] = rup[i-j+n] = 0;
                }
            }
        }
    }

}
