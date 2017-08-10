
public class RotateImage {
	public void rotate(int[][] matrix) {
        int n = matrix.length-1;
        int d = (n+1)/2;
        int temp;
        for(int i=0;i<d;i++){
        	for(int j=0;j< n-i*2;j++){
        		temp = matrix[n-i][j];
        		matrix[n-i][j] = matrix[j][n-i];
        		matrix[j][n-i] = matrix[i][j];
        		matrix[i][j] = matrix[n-i][i];
        		matrix[n-i][i] = temp;
        	}
        }
    }
}
