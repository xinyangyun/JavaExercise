package 深度优先搜索;

import java.util.Scanner;

public class 蒜头君开公司 {
	static int n, ans;
	static int[][] task = new int[15][15];
	static boolean[] used = new boolean[15];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				task[i][j] = sc.nextInt();
			}
		}
		ans = 20000;
		dfs(0,0);
		System.out.println(ans);
	}

	static void dfs(int x, int t) {
		if (x == n) {
			if (t < ans) {
				ans = t;
			}
			return;
		}
		for (int i = 0; i < n; i++) {
			if (!used[i]) {
				used[i] = true;
				dfs(x+1,t+task[x][i]);
				used[i] = false;
			}
		}
	}
}
