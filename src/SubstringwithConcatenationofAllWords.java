import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//该解法超时
public class SubstringwithConcatenationofAllWords {
	public List<Integer> findSubstring(String s, String[] words) {
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		int i = 0,len = 0;
		for(String str: words ){
			if(map.containsKey(str)){
				int x = map.get(str) + 1;
				map.put(str,x);
			}else{
				map.put(str, 1);
			}
			i++;
			len = str.length();
		}
		return find(s,words,0,len,map,i);
	}
	
	public List<Integer> find(String s, String[] words,int x,int len,HashMap<String,Integer> map,int numwords){
		HashMap<String,Integer> test = new HashMap<String,Integer>();
		List<Integer> list = new ArrayList<Integer>();
		int slen = s.length();
		if(slen - x - 1 < numwords*len)
			return list;
		int y = x + len;
		int ans = 0;
		int num = 0 ;

		while(y < s.length() && num != numwords  ){
			String word = s.substring(x,y);
			if(map.get(word) != null){
				if(!test.containsKey(word)){
					test.put(word, 1);
				}else{
					int shu = test.get(word) + 1;
					if(shu<=map.get(word)){
						test.put(word, shu);
					}else{
						break;
					}
				}
				num++;
				x+=len;y+=len;
			}else{
				break;
			}
		}
		if(num == numwords){
			list.add(ans);
		}
		ans++;
		list.addAll(find(s,words,ans,len,map,numwords));
		return list;
	}
}
