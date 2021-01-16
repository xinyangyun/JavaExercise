package LC;

public class LC20包围区域 {

	public int rowNum = 0;
	public int colNum = 0;

	/*
	 * 所有与四条边相连的O都保留， 其它O都变为X 遍历四条边上的O， 并深度遍历与 其相连的O，将这些O都转为* 将剩余的O变为X 将剩余的*变为O
	 */
	public void solve(char[][] board) {
		if (board == null || board.length <= 0 || board[0].length <= 0) {
			return;
		}

		rowNum = board.length;
		colNum = board[0].length;
		for (int i = 0; i < colNum; i++) { //第一行和最后一行
			dfs(board, 0, i);
			dfs(board, rowNum-1, i);
		}
		for (int i = 0;i < rowNum;i++) { //第一列和最后一列
			dfs(board, i, 0);
			dfs(board, i, colNum-1);
		}
		for (int i = 0;i < rowNum;i++) {
			for (int j = 0;j < colNum;j++) {
				if (board[i][j] == 'O') {
					board[i][j] = 'X';
				}
			}
		}
		for (int i = 0;i < rowNum;i++) {
			for (int j = 0;j < colNum;j++) {
				if (board[i][j] == '*') {
					board[i][j] = 'O';
				}
			}
		}
	}

	public void dfs(char[][] board, int row, int col) {
		if (board[row][col] == 'O') {
			board[row][col] = '*';
			if (row > 1) {
				dfs(board, row - 1, col);
			}
			if (col > 1) {
				dfs(board, row, col - 1);
			}
			if (row < rowNum - 1) {
				dfs(board, row + 1, col);
			}
			if (col < colNum - 1) {
				dfs(board, row, col + 1);
			}
		}
	}

}
