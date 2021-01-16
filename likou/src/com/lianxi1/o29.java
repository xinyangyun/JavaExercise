package com.lianxi1;

public class o29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int[] spiralOrder(int[][] matrix) {
		if (matrix.length == 0) {
			return new int[0];
		}
		int maxRow = matrix.length, maxCol = matrix[0].length; // ����������������

		int resLen = maxRow * maxCol; // ������鳤��
		int[] res = new int[resLen];
		int resIndex = 0;

		int row = 0, col = 0;

		while (row <= maxRow && col <= maxCol) {
			for (int i = col; i < maxCol; i++) { // ����
				res[resIndex++] = matrix[row][i];
				if (resIndex == resLen) { // ����������
					return res;
				}
			}
			for (int i = row + 1; i < maxRow - 1; i++) { // ����
				res[resIndex++] = matrix[i][maxCol - 1];
				if (resIndex == resLen) {
					return res;
				}
			}
			for (int i = maxCol-1; i > col; i++) {  //����
				res[resIndex] = matrix[maxRow-1][i];
				if (resIndex == resLen) {
					return res;
				}
			}
			for (int i = maxRow-1; i > row; i++) {  //����
				res[resIndex] = matrix[i][col];
				if (resIndex == resLen) {
					return res;
				}
			}
			row++;
			col++;
			maxRow--;
			maxCol--;
		}

		return res;
	}

}
