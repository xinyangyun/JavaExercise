package 深度优先搜索;

import java.util.Scanner;




/**
 * 
 * 解题思路：首先创建地图，然后找到王子和公主，写两个dfs，写两个二维数组来标记他们走过的路，然后第一个
 * dfs用来搜索王子走过的路，走过之后就标记，然后第二个dfs用来搜索公主走过的路，如果公主走过的路王子也
 * 走过，那么就说明王子可以就出公主，就return掉。
 * @author CXTX1112
 *
 */
public class 王子救公主 {

	static boolean f;
	static int n, m, x1, y1, x2, y2;
	static String[] s = new String[110];
	static char[][] ch = new char[110][110];
	static boolean[][] vis1 = new boolean[110][110];
	static boolean[][] vis2 = new boolean[110][110];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();

		for (int i = 0; i < n; i++) {
			s[i] = sc.next();
			for (int j = 0; j < m; j++) {
				ch[i][j] = s[i].charAt(j);
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (ch[i][j] == 'w') {
					x1 = i;
					y1 = j;
				}else if(ch[i][j] == 'g') {
					x2 = i;
					y2 = j;
				}
			}
		}

		dfs(x1, y1);
		dfs2(x2, y2);

		if (f) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}

	}

	static void dfs(int x, int y) {
		if (!in(x, y) || vis1[x][y] || ch[x][y] == '#') {
			return;
		}

		vis1[x][y] = true;

		dfs(x - 2, y);
		dfs(x + 2, y);
		dfs(x, y - 2);
		dfs(x, y + 2);

	}

	static void dfs2(int x, int y) {
		if (f) {
			return;
		}

		if (!in(x, y) || vis2[x][y] || ch[x][y] == '#') {
			return;
		}

		if (vis1[x][y]) {
			f = true;
			return;
		}

		vis2[x][y] = true;

		dfs2(x - 1, y);
		dfs2(x + 1, y);
		dfs2(x, y - 1);
		dfs2(x, y + 1);

	}

	static boolean in(int x, int y) {
		return x >= 0 && x < n && y >= 0 && y < m;
	}
}
