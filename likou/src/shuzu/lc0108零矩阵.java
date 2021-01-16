package shuzu;

import java.util.ArrayList;
import java.util.Arrays;

public class lc0108零矩阵 {
	public static void main(String[] args) {

		int[][] arr = { { 0, 1, 2, 0 }, { 3, 4, 5, 2 }, { 1, 3, 1, 5 } };
		setZeroes2(arr);
	}

	public static void setZeroes(int[][] matrix) {
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		System.out.println(matrix[0].length);
		System.out.println(matrix.length);
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.println(j);

				if (matrix[i][j] == 0) {
					ArrayList<Integer> list2 = new ArrayList<>();
					list2.add(i);
					list2.add(j);
					list.add(list2);
				}
			}
		}

		for (ArrayList<Integer> alist : list) {
			Integer row = alist.get(0);
			Integer col = alist.get(1);
			for (int i = 0; i < matrix[0].length; i++) {
				matrix[row][i] = 0;
			}
			for (int i = 0; i < matrix.length; i++) {
				matrix[i][col] = 0;
			}
		}

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println(Arrays.toString(matrix));
	}

	public static void setZeroes2(int[][] matrix) {
		boolean isFirstRowHaveZero = false;
		boolean isFirstColHaveZero = false;
		for (int i = 0; i < matrix.length; i++) {
			if (matrix[i][0] == 0) {
				isFirstColHaveZero = true;
			}
		}

		for (int j = 0; j < matrix[0].length; j++) {
			if (matrix[0][j] == 0) {
				isFirstRowHaveZero = true;
			}
		}

		for (int i = 1; i < matrix.length; i++) {
			for (int j = 1; j < matrix[i].length; j++) {
				if (matrix[i][j] == 0) {
					matrix[0][j] = 0;
					matrix[i][0] = 0;
				}
			}
		}

		for (int i = 1; i < matrix.length; i++) {
			for (int j = 1; j < matrix[i].length; j++) {
				if (matrix[0][j] == 0 || matrix[i][0] == 0) {
					matrix[i][j] = 0;
				}
			}
		}

		for (int i = 0; i < matrix.length; i++) {
			if (isFirstColHaveZero) {
				matrix[i][0] = 0;
			}
		}

		for (int j = 0; j < matrix[0].length; j++) {
			if (isFirstRowHaveZero) {
				matrix[0][j] = 0;
			}
		}

	}

}
