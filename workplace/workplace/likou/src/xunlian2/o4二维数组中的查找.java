package xunlian2;

import java.util.Scanner;

public class o4二维数组中的查找 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] arr = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		int target = sc.nextInt();
		boolean findnum = findnum(arr, target);
		System.out.println(findnum);
	}

	public static boolean findnum(int[][] matrix, int target) {
		if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
			return false;
		}
		int rows = matrix.length, cols = matrix[0].length;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (matrix[i][j] == target) {
					return true;
				}
			}
		}
		return false;
	}
}

//5
//5
//1 4 7 11 15
//2 5 8 12 19
//3 6 9 16 22
//10 13 14 17 24
//18 21 23 26 30
