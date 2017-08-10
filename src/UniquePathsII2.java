
public class UniquePathsII2 {
	public int uniquePathsWithObstacles(int[][] obstacleGrid) {
		int m = obstacleGrid.length,n = obstacleGrid[0].length;
		int ans[][] = new int[m+1][n+1];
		ans[1][0] = 1;
		for(int i=1;i<=m;i++){
			for(int j=1;j<=n;j++){
				if(obstacleGrid[i-1][j-1]== 0){
					ans[i][j] = ans[i-1][j] + ans[i][j-1];
				}
			}
		}
		return ans[m][n];
	}
}
