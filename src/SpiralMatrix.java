import java.util.*;

public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = m!=0?matrix[0].length:0;
        int looptimes= ( Math.min(m,n) + 1 ) / 2;
        List<Integer> ans = new ArrayList<Integer>();
        for(int i=0;i<looptimes-1;i++){
        	int x=n-(i*2),y=m-(i*2);
        	for(int j=0;j<x;j++){
        		ans.add( matrix[i][j+i] );
        	}
        	for(int j=0;j<y-1;j++){
        		ans.add( matrix[j+i+1][n-1-i] );
        	}
        	
        	if(y!=1){
        		for(int j=0;j<x-1;j++){
            		ans.add( matrix[m-1-i][n-2-i-j]);
            	}
        	}
        	if(x!=1){
        		for(int j=0;j<y-2;j++){
            		ans.add( matrix[m-2-i-j][i] );
            	}
        	}
        	
        }
        return ans;
    }
}
