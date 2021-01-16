package 抽象深度优先搜索;

import java.util.Scanner;

public class 方程的解数 {
	static int n,m,ans;
	static int[] k = new int[5];
	static int[] p = new int[5];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		for (int i = 0; i < n; i++) {
			k[i] = sc.nextInt();
			p[i] = sc.nextInt();
		}
		dfs(0,0);
		System.out.println(ans);
	}
	
	static void dfs(int x,long s) {
		if (x == n) {
		
			if (s == 0) {
				ans++;
			}
			return;
		}
		for (int i = 1; i <= m; i++) {
			dfs(x+1,s+k[x]*poww(i,p[x]));
		}
	}
	
	static long poww(int x,int y) {
		long ret = 1;
		for (int i = 0; i < y; i++) {
			ret*=x;
		}
		return ret;
	}
	
}
