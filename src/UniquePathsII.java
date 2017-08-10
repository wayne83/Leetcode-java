
public class UniquePathsII {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length , n = obstacleGrid[0].length;
        int[][] ans = new int[m+1][n+1];
        		for(int i=1;i<=m;i++){
        			if(obstacleGrid[i-1][0] == 0)
        				ans[i][1] = 1;
        			else
        				break;
                }
                for(int i=1;i<=n;i++){
                	if(obstacleGrid[0][i-1] == 0)
                		ans[1][i] = 1;
                	else
                		break;
                }
                
                for(int i=2;i<=m;i++){
                	for(int j=2;j<=n;j++){
                		if( obstacleGrid[i-1][j-1] == 0 ){
                			if( obstacleGrid[i-2][j-1] == 0 ){
                				ans[i][j] += ans[i-1][j-1];
                				int a = i-2;
                				while( a >= 1 ){
                        			if( obstacleGrid[a-1][j-1] == 0 ){
                        				ans[i][j] += ans[a][j-1];
                        				a--;
                        			}else{
                        				break;
                        			}
                        		}
                			}
                			if( obstacleGrid[i-1][j-2] == 0){
                				ans[i][j] += ans[i-1][j-1];
                				int b= j-2;	
                        		while( b >= 1){
                        			if( obstacleGrid[i-1][b-1] == 0){
                        				ans[i][j] += ans[i-1][b];
                            			b--;
                        			}else{
                        				break;
                        			}
                        		}
                			}
                		} 
                	}
                }
                return ans[m][n];
    }
}
