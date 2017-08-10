import java.util.HashMap;

public class ValidSudoku1 {
	public boolean isValidSudoku(char[][] board) {
		char[][] sudoku = new char[9][9];
		for (char[] s : board) {
			if (!isValid(s))
				return false;
		}
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				sudoku[i][j] = board[j][i];
			}
		}
		for (char[] s : sudoku) {
			if (!isValid(s))
				return false;
		}
		int row , col ;
		for(int i=0;i<9;i++){
			for(int j=0;j<9;j++){
				row = i/3;col = i%3;
				sudoku[i][j] = board[row*3 + j/3][col*3 + j%3 ];
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
