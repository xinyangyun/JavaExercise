package JZ;

import java.util.ArrayList;

public class JZ19À≥ ±’Î¥Ú”°æÿ’Û {
	public static void main(String[] args) {

		int[][] x = new int[2][2];
		x[0][0] = 1;
		x[0][1] = 2;
		x[1][0] = 3;
		x[1][1] = 4;

		ArrayList<Integer> printMatrix = printMatrix(x);

		for (int i = 0; i < printMatrix.size(); i++) {
			System.out.println(printMatrix.get(i));
		}

	}

	public static ArrayList<Integer> printMatrix(int[][] matrix) {

		if (matrix.length == 0) {
			return new ArrayList<>();
		}

		int l = 0;
		int r = matrix[0].length - 1;
		int t = 0;
		int b = matrix.length - 1;

		ArrayList<Integer> res = new ArrayList<>();

		while (l <= r && t <= b) {
			if (t == b) {
				for (int i = l; i <= r; i++) {
					res.add(matrix[t][i]);
				}
				return res;
			}

			if (l == r) {
				for (int i = l; i <= r; i++) {
					res.add(matrix[t][i]);
				}
				return res;
			}

			for (int i = l; i <= r; i++) {
				res.add(matrix[t][i]);
			}

			for (int i = t; i <= b; i++) {
				res.add(matrix[i][r]);
			}

			for (int i = r; i >= l; i--) {
				res.add(matrix[b][i]);
			}

			for (int i = b; b >= t; i--) {
				res.add(matrix[i][l]);
			}

			l = l + 1;
			r = r - 1;
			t = t + 1;
			b = b - 1;
		}

		return res;
	}

}
