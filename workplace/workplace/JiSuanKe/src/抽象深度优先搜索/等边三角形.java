package 抽象深度优先搜索;

import java.util.Scanner;

public class 等边三角形 {
	static int n, sum = 0;
	static int[] p = new int[25];
	static boolean f;
	static boolean[] vis = new boolean[25];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for (int i = 0; i < args.length; i++) {
			p[i] = sc.nextInt();
			sum += p[i];
		}
		if (sum % 3 != 0) {
			System.out.println("no");
		}else {
			dfs(0,0,0);
			if (f) {
				System.out.println("yes");
			}else {
				System.out.println("no");
			}
		}
	}
	
	static void dfs(int p1,int s,int st) {
		if (f) {
			return;
		}
		if (p1 == 3) {
			f = true;
			return;
		}
		if (s == sum/3) {
			dfs(p1+1,0,0);
			return;
		}
		for (int i = st; i < n; i++) {
			if (!vis[i]) {
				vis[i] = true;
				dfs(p1,s+p[i],i+1);
				vis[i] = false;
			}
		}
	}
}
