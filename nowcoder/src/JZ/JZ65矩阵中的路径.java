package JZ;

import javax.swing.border.Border;

public class JZ65矩阵中的路径 {

	public boolean hasPath(char[] matrix, int rows, int cols, char[] str)
    {
		
		int[] flag = new int[matrix.length];
		for (int i = 0;i < cols;i++) {
			for (int j = 0;j < rows;j++) {
				if (dfs(matrix, rows,cols,	 str, i, j, 0,flag)) {
					return true;
				}
			}
		}
		return false;
    }

	boolean dfs(char[] board, int rows, int cols, char[] str, int i, int j, int k, int[] flag) {
//		if (i >= board.length || i < 0 || j >= board[0].length || j < 0 || board[i][j] != str[k]) return false;
		int index = i * cols + j;

		if (i < 0 || i >= rows || j < 0 || j >= cols || board[index] != str[k] || flag[index] == 1)
			return false;

		if (k == str.length - 1)
			return true; // 找到了最后一个

		flag[index]  = 1;
		
		boolean res = dfs(board,rows,cols, str, i + 1, j, k + 1,flag) || dfs(board,rows,cols, str, i - 1, j, k + 1,flag)
				|| dfs(board,rows,cols, str, i, j + 1, k + 1,flag) || dfs(board,rows,cols, str, i, j - 1, k + 1,flag);

		flag[index] = 0;
		
		return res;
	}

}
