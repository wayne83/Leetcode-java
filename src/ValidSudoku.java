import java.util.HashMap;

public class ValidSudoku {
	public boolean isValidSudoku(char[][] board) {
		char[][] sudoku = new char[9][9];
		//判断每行是否有重复数
		for (char[] s : board) {
			if (!isValid(s))
				return false;
		}
		//把数组转化为以列为单位
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				sudoku[i][j] = board[j][i];
			}
		}
		for (char[] s : sudoku) {
			if (!isValid(s))
				return false;
		}
		//把数组转化为以九宫格为单位
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				for (int m = 0; m < 3; m++) {
					for (int n = 0; n < 3; n++) {
						sudoku[i * 3 + j][m * 3 + n] = board[i * 3 + m][j * 3
								+ n];
					}
				}
			}
		}
		for (char[] s : sudoku) {
			if (!isValid(s))
				return false;
		}
		return true;
	}
	public boolean isValid(char[] sudoku) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (char i : sudoku) {
			if (i != '.') {
				if (!map.containsKey(i))
					map.put(i, 1);
				else
					return false;
			}
		}
		return true;
	}
}
