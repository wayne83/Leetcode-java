import java.util.*;

public class WordLadder {
	public int ladderLength(String beginWord, String endWord,
			List<String> wordList) {

		List<String> begin  = new ArrayList<String>();
		begin.add(beginWord);
		return BFS(begin, endWord, wordList, 1);
	}

	public int BFS(List<String> startWords, String endWord, List<String> wordList,
			int ans) {

		if(startWords.size() == 0)
			return 0;
		
		for(int i=0;i<startWords.size();i++){
			if (startWords.get(i).equals(endWord))
				return ans;
		}
		List<String> list = new ArrayList<String>();
		for(int i=0;i<startWords.size();i++){
			for(int j=0;j<wordList.size();j++){
				if( pdequals( startWords.get(i),wordList.get(j) ) ){
					 list.add(wordList.get(j));
					 wordList.remove(j);
				}
			}
		}
		return BFS(list, endWord, wordList,++ans);
	}

	public boolean pdequals(String a, String b) {
		int num = 0;
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) == b.charAt(i))
				num++;
		}
		return (num == a.length() - 1) ? true : false;
	}

}
