package 枚举算法;

import java.util.Scanner;

public class 最大子阵 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int ans = -1005;
		int[][] ch = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				ch[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < n; i++) {
			for (int k = i; k < n; k++) {
				for (int j = 0; j < m; j++) {
					for (int l = j; l <  m; l++) {
						int sum = 0;
						for (int p = i; p <= k; p++) {
							for (int q = j; q <= l; q++) {
								sum += ch[p][q];
							}
						}
						if (sum > ans ) {
							ans = sum;
						}
					}
				}
			}
		}
		System.out.println(ans);
	}
}
