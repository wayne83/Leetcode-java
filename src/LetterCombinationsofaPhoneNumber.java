import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class LetterCombinationsofaPhoneNumber {
	public List<String> letterCombinations(String digits) {
		List<String> list = new ArrayList<String>();
		char[][] map = { {}, {}, {}, { 'a', 'b', 'c' }, { 'd', 'e', 'f' },
				{ 'g', 'h', 'i' }, { 'j', 'k', 'l' }, { 'm', 'n', 'o' },
				{ 'p', 'q', 'r', 's' }, { 't', 'u', 'v' },
				{ 'w', 'x', 'y', 'z' } };
		int len = digits.length();
		if (len == 0) {
			return list;
		} else {
			list.add("");
			for (int i = 0; i < len; i++) {
				int num = digits.charAt(i) - '0';
				char[] temp = map[num];
				int cs = list.size();
				for (int j = 0; j < cs; j++) {
					for (int z = 0; z < temp.length; z++) {
						String str = list.get(j);
						str = str + temp[z];
						System.out.println(str);
						list.add(str);
					}
					list = list.subList(cs, cs*temp.length+cs);
				}
			}
			return list;
		}

	}

}
