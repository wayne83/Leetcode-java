
public class UniquePaths {
    public int uniquePaths(int m, int n) {
        int ans[][] = new int[m+1][n+1];
        for(int i=1;i<=m;i++){
        	ans[i][1] = 1;
        }
        for(int i=1;i<=n;i++){
        	ans[1][i] = 1;
        }
        
        for(int i=2;i<=m;i++){
        	for(int j=2;j<=n;j++){
        		ans[i][j] = 2 * ans[i-1][j-1];
        		int a = i-2;
        		while( a >= 1){
        			ans[i][j] += ans[a][j-1];
        			a--;
        		}
        		int b= j-2;	
        		while( b >= 1){
        			ans[i][j] += ans[i-1][b];
        			b--;
        		}
        			
        	}
        }
        return ans[m][n];
    }
}
