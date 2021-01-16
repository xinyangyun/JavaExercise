package 快速提升代码能力;

import java.util.Scanner;

public class 最大字矩阵 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] arr = new int[55][55];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		int sum = -1005;
		for (int i = 0; i < n; i++) {
			for (int i1 = i; i1 < n; i1++) {
				for (int j = 0; j < m; j++) {
					for (int j1 = j; j1 < m; j1++) {
						int s0 = 0;
						for (int k1 = i; k1 <= i1; k1++) {
							for (int k2 = j; k2 <= j1; k2++) {
								s0 += arr[k1][k2];
							}
						}
						if (s0 >sum) {
							sum = s0;
						}
					}
				}
			}
		}
		System.out.println(sum);
	}
}
