package 抽象深度优先搜索;

import java.util.Scanner;

public class twon皇后问题 {

	static int n, ans;
	static int[] vx = new int[10]; // 横线
	static int[] vy = new int[10]; // 列
	static int[] vd1 = new int[20]; // 对角线1
	static int[] vd2 = new int[20]; // 对角线2
	static int[][] mp = new int[10][10];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] s = new String[10];

		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				mp[i][j] = sc.nextInt();
			}
		}
		dfs(0,1);
		System.out.println(ans);
	}

	static void dfs(int x,int p) {
		if (x == n && p == 2) {
			ans++;
			return;
		}
		if (x == n) {
			dfs(0,p+1);
			return;
		}
		for (int i = 0; i < n; i++) {
			if(mp[x][i]!=0&&vy[i]!=3&&vy[i]!=p&&vd1[x+i]!=3&&vd1[x+i]!=p&&vd2[x-i+n]!=3&&vd2[x-i+n]!=p) {
				//3为黑皇后，p等于2，为白皇后，当不等于白黑皇后，和地图上不为0才可以dfs
				mp[x][i]=0;
				vy[i]+=p;
				vd1[x+i]+=p;
				vd2[x-i+n]+=p;
				dfs(x+1,p);
				vy[i]-=p;
				vd1[x+i]-=p;
				vd2[x-i+n]-=p;
				mp[x][i]=1;
			}
		}
	}
}
