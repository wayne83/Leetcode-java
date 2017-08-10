import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SubstringwithConcatenationofAllWords1 {
	public List<Integer> findSubstring(String s, String[] words) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		List<Integer> list = new ArrayList<Integer>();
		int slen = s.length();
		if (words.length == 0 || slen < words.length * words[0].length())
			return list;
		int numwords = 0, len = words[0].length();
		for (String str : words) {
			if (map.containsKey(str))
				map.put(str, map.get(str) + 1);
			else
				map.put(str, 1);
			numwords++;
		}
		String temp,word;
		HashMap<String, Integer> test = new HashMap<String, Integer>();
		for (int i = 0; i < len; i++) {
			int num = 0;
			for (int l = i, r = i; r + len <= slen; r += len) {
				word = s.substring(r, r + len);
				if (map.containsKey(word)) {
					if (test.containsKey(word))
						test.put(word, test.get(word) + 1);
					else
						test.put(word, 1);
					if (test.get(word) <= map.get(word))
						num++;
					while (test.get(word) > map.get(word)) {
						temp = s.substring(l, l + len);
						test.put(temp, test.get(temp) - 1);
						l = l + len;
						if(!temp.equals(word))num--;
					}
					if (num == numwords) {
						list.add(l);
						temp = s.substring(l, len + l);
						test.put(temp, map.get(temp) - 1);
						l = l + len;
						num--;
					}
				} else {
					test.clear();
					num = 0;
					l = r + len;
				}
			}
			test.clear();
		}
		return list;
	}
}
