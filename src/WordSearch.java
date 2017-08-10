public class WordSearch {
	public boolean exist(char[][] board, String word) {
		
		int row = board.length;
		int column = board[0].length;
		
		for(int i=0;i<row;i++){
			for(int j=0;j<column;j++){
				if(dfs(board,i,j,0,word)){
					return true;
				}
				
			}
		}
		
		return false;
	}
	
	public boolean dfs(char[][] board,int x, int y ,int num,String word){
		if(num == word.length()){
			return true;
		}
		if(x<0 || x == board.length || y<0 || y == board[0].length){
			return false;
		}
		if(board[x][y] != word.charAt(num)){
			return false;
		}
		
		board[x][y] = '*';
		boolean exist =  dfs(board,x-1,y,num+1,word) || dfs(board,x+1,y,num+1,word) || dfs(board,x,y-1,num+1,word) || dfs(board,x,y+1,num+1,word);
		board[x][y] = word.charAt(num);
		return exist;
	}
	
}
