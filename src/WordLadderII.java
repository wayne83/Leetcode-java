import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class WordLadderII {
	public List<List<String>> findLadders(String beginWord, String endWord,
			List<String> wordList) {

		HashMap<String, Integer> dict = new HashMap<String, Integer>();
		for (int i = 0; i < wordList.size(); i++) {
			dict.put(wordList.get(i), Integer.MAX_VALUE);
		}
		List<String> begin = new ArrayList<String>();
		begin.add(beginWord);
		List<List<String>> ans = new ArrayList<List<String>>();
		ans.add(begin);
		return BFS(endWord, dict, ans, 0);
	}

	public List<List<String>> BFS(String endWord,
			HashMap<String, Integer> dict, List<List<String>> ans, int ceng) {

		List<List<String>> temp = new ArrayList<List<String>>();
		if (ans.size() == 0)
			return temp;

		for (int i = 0; i < ans.size(); i++) {
			if (ans.get(i).get(ans.get(i).size() - 1).equals(endWord)) {
				temp.add(ans.get(i));
			}
		}
		if (temp.size() != 0) {
			return temp;
		} else {
			List<String> nextWord = new ArrayList<String>();

			for (int i = 0; i < ans.size(); i++) {
				String s = ans.get(i).get(ans.get(i).size() - 1);
				nextWord = getNextWord(s, dict);
				for (int j = 0; j < nextWord.size(); j++) {
					if ( dict.get(nextWord.get(j)) >= ceng ) {
						List<String> list = new ArrayList<String>(ans.get(i));
						list.add(nextWord.get(j));
						temp.add(list);
						dict.put(nextWord.get(j), ceng);
					}
				}

			}
			return BFS(endWord, dict, temp,++ceng);
		}
	}

	public List<String> getNextWord(String s, HashMap<String, Integer> dict) {
		List<String> res = new ArrayList<String>();
		char chs[] = s.toCharArray();
		for (char ch = 'a'; ch <= 'z'; ch++) {
			for (int i = 0; i < chs.length; i++) {
				if (chs[i] == ch)
					continue;
				char old_ch = chs[i];
				chs[i] = ch;
				if (dict.containsKey(String.valueOf(chs))) {
					res.add(String.valueOf(chs));
				}
				chs[i] = old_ch;
			}
		}
		return res;
	}

}
