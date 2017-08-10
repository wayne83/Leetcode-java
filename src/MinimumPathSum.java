
public class MinimumPathSum {
    public int minPathSum(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int[][] ans = new int[m+1][n+1];
        for(int i=2;i<=m;i++){
        	ans[i][0] = Integer.MAX_VALUE; 
        }
        for(int j=2;j<=n;j++){
        	ans[0][j] = Integer.MAX_VALUE;
        }
        for(int i=1;i<=m;i++){
        	for(int j=1;j<=n;j++){
        		ans[i][j] = grid[i-1][j-1] + (ans[i-1][j]>ans[i][j-1]?ans[i][j-1]:ans[i-1][j]); 
        	}
        }
        return ans[m][n];
    }
}
