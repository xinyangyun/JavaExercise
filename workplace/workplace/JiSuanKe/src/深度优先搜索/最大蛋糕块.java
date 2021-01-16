package 深度优先搜索;

import java.util.Scanner;

public class 最大蛋糕块 {
	static int n, m, sum;
	static String[] st = new String[1005];
	static char[][] maze = new char[1005][1005];
	static int[][] dir = { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 } };
	static boolean[][] vis = new boolean[1005][1005];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		int ans = 0;
		for (int i = 0; i < n; i++) {
			st[i] = sc.next();
			for (int j = 0; j < m; j++) {
				maze[i][j] = st[i].charAt(j);
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (maze[i][j] == '#' && !vis[i][j]) {
					sum = 0;
					dfs(i, j);
					if (sum > ans) {
						ans = sum;
					}
				}
			}
		}
		System.out.println(ans);
	}

	static void dfs(int x, int y) {
		sum++;
		vis[x][y] = true;
		for (int i = 0; i < 4; i++) {
			int tx = x + dir[i][0];
			int ty = y + dir[i][1];
			if (in(tx, ty) && maze[tx][ty] != '.' && !vis[tx][ty]) {
				dfs(tx,ty);
			}
		}
	}

	static boolean in(int x, int y) {
		return x >= 0 && x < n && y >= 0 && y < m;
	}
}
