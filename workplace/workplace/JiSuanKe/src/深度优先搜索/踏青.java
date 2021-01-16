package 深度优先搜索;

import java.util.Scanner;

public class 踏青 {
	static int n, m;
	static String[] st = new String[105];
	static int[][] maze = new int[105][105];
	static boolean[][] vis = new boolean[105][105];
	static int[][] dir = { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 } };
	static int ans = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		for (int i = 0; i < n; i++) {
			st[i] = sc.next();
			for (int j = 0; j < m; j++) {
				maze[i][j] = st[i].charAt(j);
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (maze[i][j] == '#' && !vis[i][j]) {
					dfs(i,j);
					ans++;
				}
			}
		}
		System.out.println(ans);
	}

	static void dfs(int x, int y) {
		vis[x][y] = true;
		for (int i = 0; i < 4; i++) {
			int tx = x + dir[i][0];
			int ty = y + dir[i][1];
			if (in(tx, ty) && maze[tx][ty] != '.' && !vis[tx][ty]) {
				dfs(tx, ty);
			}
		}
	}

	static boolean in(int x, int y) {
		return x >= 0 && x < n && y >= 0 && y < m;
	}
}
