import java.util.*;

public class PalindromePartitioning {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<List<String>>();
        List<String> temp = new ArrayList<String>();
        loop(s,ans,temp);
        return ans;
    }
    
    public void loop(String s,List<List<String>> ans, List<String> temp){
    	if(ispalindrome(s)){
    		List<String> tp = new ArrayList<String>(temp);
    		tp.add(s);
    		ans.add(tp);
    	}
    	for(int i=0;i<s.length()-1;i++){
    		String sub1 = s.substring(0,i+1);
    		String sub2 = s.substring(i+1,s.length());
    		if(ispalindrome(sub1)){
    			temp.add(sub1);
    			loop(sub2,ans,temp);
    			temp.remove(temp.size()-1);
    		}
    		
    	}
    }
    
    public boolean ispalindrome(String s){
    	int start = 0;
    	int end = s.length()-1;
    	while(start < end && s.charAt(start) == s.charAt(end)){
    		start+=1;
    		end-=1;
    	}
		return start>=end?true:false;
    }
}
