import java.util.*;

public class WordBreakII {
	public List<String> wordBreak(String s, List<String> wordDict) {
		return DFS(s,wordDict,new HashMap<String,List<String>>());
	} 
	
	public List<String> DFS(String s, List<String> wordDict,HashMap<String,List<String>> map){
		if(map.containsKey(s)){
			return map.get(s);
		}
		
		List<String> res = new ArrayList<String>();
		if(s.equals("")){
			res.add("");
			return res;
		}else{
			for(String word:wordDict){
				if(s.startsWith(word)){
					List<String> substring = DFS(s.substring(word.length()),wordDict,map);
					for(String sub:substring){
						res.add( word + (sub==""?"":" ") + sub );
					}
				}
			}
			map.put(s, res);
			return res;
		}
	}
}
