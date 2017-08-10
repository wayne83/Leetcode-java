
public class EditDistance {
    public int minDistance(String word1, String word2) {
        int m = word1.length(),n = word2.length();
        int ans[] = new int[n+1];
        int prev,cuv;
        for(int i=0;i<=n;i++){
        	ans[i] = i;
        }
        for(int i=1;i<=m;i++){
        	prev = i;
        	for(int j=1;j<=n;j++){
        		if( word1.charAt(i-1) == word2.charAt(j-1) ){
        			cuv = ans[j-1];
        		}else{
        			cuv = Math.min( Math.min( ans[j], prev) , ans[j-1]) + 1;
        		}
        		ans[j-1] = prev;
        		prev = cuv;
        	}
        	ans[n] = prev;
        }
        return ans[n];
    }
}
