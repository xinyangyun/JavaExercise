package 深度优先搜索;

import java.util.Scanner;



/**
 * 
 * 解题思路：利用dfs，先创建地图，马跑的方向，然后在dfs的方法中设置一个step的参数用来记录
 * 马儿跑的步数，马儿跑过时就将该点变为#号。最后遍历输出地图。
 * @author CXTX1112
 *
 */
public class 马的覆盖点 {

	static int n, m, x, y;
	static char[][] map = new char[105][105];
	static int[][] dir = { { -2, -1 }, { -2, 1 }, { -1, -2 }, { -1, 2 }, { 2, -1 }, { 2, 1 }, { 1, -2 }, { 1, 2 } };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		x = sc.nextInt();
		y = sc.nextInt();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				map[i][j] = '.';
			}
		}
		dfs(x - 1, y - 1, 0);
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(map[i][j]);
			}
			System.out.println();
		}
	}

	static void dfs(int x, int y, int step) {
		if (step > 3) {
			return;
		}
		if (!in(x, y)) {
			return;
		}
		map[x][y] = '#';
		for (int i = 0; i < 8; i++) {
			dfs(x+dir[i][0],y+dir[i][1],step+1);
		}
	}

	static boolean in(int x, int y) {
		return x >= 0 && x < n && y >= 0 && y < m;
	}
}
