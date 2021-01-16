package xunlian2;

public class o12¾ØÕóÖĞµÄÂ·¾¶ {

	static int[][] direct = { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 } };
	static boolean[][] visited;
	static int row, col;

	public static void main(String[] args) {

	}

	public static boolean exist(char[][] board, String word) {
		row = board.length;
		col = board[0].length;
		visited = new boolean[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (dfs(board, i, j, word, 0)) {
					return true;
				}
			}
		}
		return false;
    }

	public static boolean dfs(char[][] board, int x, int y, String word, int index) {
		if (index == word.length()) {
			return true;
		}

		if (board[x][y] == word.charAt(index)) {
			if (index + 1 == word.length()) {
				return true;
			}
			visited[x][y] = true;
			for (int i = 0; i < 4; i++) {
				int newX = x + direct[i][0];
				int newY = y + direct[i][1];
				if (in(newX, newY) && !visited[newX][newY]) {
					if (dfs(board, newX, newY, word, index+1)) {
						return true;
					}
				}
			}
			visited[x][y] = false;
		}
		return false;
	}

	static boolean in(int x, int y) {
		return x >= 0 && x < row && y >= 0 && y < col;
	}
}
