package 快速提升代码能力;

import java.util.Scanner;

public class 矩阵旋转 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] arr = new int[205][205];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (j != n - 1) {
					System.out.print(arr[n-1-j][i]+" ");
				}else {
					System.out.println(arr[n-1-j][i]);
				}
			}
		}
	}
}
