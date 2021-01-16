package 深度优先搜索;

import java.util.Scanner;

public class 迷宫解的方案数 {
	static int n,m;
	static String[] st = new String[12];
	static char[][] maze = new char[12][12];
	static int[][] dir = {{1,0},{0,1},{-1,0},{0,-1}};
	static boolean vis[][] = new boolean[12][12];
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
		int x = 0,y = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (maze[i][j] == 's') {
					x = i;
					y = j;
				}
			}
		}
		dfs(x,y);
		System.out.println(ans);
	}
	
	static void dfs(int x,int y) {
		if (maze[x][y] == 'e') {
			ans++;
			return;
		}
		vis[x][y] = true;
		for (int i = 0; i < 4; i++) {
			int tx = x + dir[i][0];
			int ty = y + dir[i][1];
			if (in(tx,ty) && maze[tx][ty] != '#' && !vis[tx][ty]) {
				dfs(tx,ty);
			}
		}
		vis[x][y] = false;
	}
	
	static boolean in(int x,int y) {
		return x >= 0 && x < n && y >= 0 & y < m;
	}
}
