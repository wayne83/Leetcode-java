import java.util.*;
public class GroupAnagrams {
public List<List<String>> groupAnagrams(String[] strs) {
		Map<String,List<String>> map = new HashMap<String,List<String>>();
		Arrays.sort(strs);
		for(int i=0;i<strs.length;i++){
			char[] ca = strs[i].toCharArray();
			Arrays.sort(ca);
			String key = String.valueOf(ca);
			if(!map.containsKey(key)){
				map.put(key,new ArrayList<String>());
			}
			map.get(key).add(strs[i]);
		}
		return new ArrayList<List<String>>(map.values());
    }
}
