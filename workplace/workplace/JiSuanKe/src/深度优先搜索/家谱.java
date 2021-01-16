package 深度优先搜索;

import java.util.Scanner;
import java.util.Vector;

public class 家谱 {

	static int u;
	static Vector<Integer>[] son = new Vector[100005];
	static int[] ans = new int[100005];
	static boolean[] f = new boolean[100005];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			son[i] = new Vector<>();
		}
		for (int i = 0; i < n - 1; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			son[x].add(y);
			f[y] = true; // 标记它不能为跟
		}
		for (int i = 1; i <= n; i++) { // 寻找跟
			if (!f[i]) {
				u = i;
				break;
			}
		}
		dfs(u);
		for (int i = 1; i <= n; i++) {
			System.out.println(ans[i]);
		}
	}

	static int dfs(int u) {
		int ret = 0;
		for (int i = 0; i < son[u].size(); i++) {
			ret += dfs(son[u].get(i));
		}
		ans[u] = ret;
		return ret + 1;
	}
}
