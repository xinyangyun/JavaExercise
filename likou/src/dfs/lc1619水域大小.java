package dfs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class lc1619ÀÆ”Ú¥Û–° {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] arr = new int[n][m];
		boolean[][] isarr = new boolean[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		int[] pondSizes = pondSizes(arr);
		
		for (int i : pondSizes) {
			System.out.print(i+" ");
		}

	}

	public static int[] pondSizes(int[][] land) {

		ArrayList<Integer> list = new ArrayList<>();

		int temp;

		for (int i = 0; i < land.length; i++) {
			for (int j = 0; j < land[0].length; j++) {
				temp = findPool(land, i, j);
				System.out.println(temp);
				if (temp!=0) {
					list.add(temp);
				}
			}
		}
		
		int[] result = list.stream().mapToInt(Integer::valueOf).toArray();
		
		Arrays.sort(result);

		return result;
	}

	public static int findPool(int[][] land, int x, int y) {
		int num = 0;
		if (x < 0 || x >= land.length || y < 0 || y >= land[0].length || land[x][y] != 0) {
			return num;
		}

		num++;
		land[x][y] = -1;

		num += findPool(land, x + 1, y);
		num += findPool(land, x - 1, y);
		num += findPool(land, x, y + 1);
		num += findPool(land, x, y - 1);
		num += findPool(land, x + 1, y + 1);
		num += findPool(land, x + 1, y - 1);
		num += findPool(land, x - 1, y + 1);
		num += findPool(land, x - 1, y - 1);

		return num;
	}

//	public static boolean in(int x, int y) {
//		return x >= 0 && x < n && y >= 0 && y < m;
//	}

}
