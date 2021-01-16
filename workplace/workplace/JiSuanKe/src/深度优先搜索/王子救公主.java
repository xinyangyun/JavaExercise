package �����������;

import java.util.Scanner;




/**
 * 
 * ����˼·�����ȴ�����ͼ��Ȼ���ҵ����Ӻ͹�����д����dfs��д������ά��������������߹���·��Ȼ���һ��
 * dfs�������������߹���·���߹�֮��ͱ�ǣ�Ȼ��ڶ���dfs�������������߹���·����������߹���·����Ҳ
 * �߹�����ô��˵�����ӿ��Ծͳ���������return����
 * @author CXTX1112
 *
 */
public class ���Ӿȹ��� {

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
