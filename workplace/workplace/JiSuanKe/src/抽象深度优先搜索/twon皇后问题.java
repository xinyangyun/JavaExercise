package ���������������;

import java.util.Scanner;

public class twon�ʺ����� {

	static int n, ans;
	static int[] vx = new int[10]; // ����
	static int[] vy = new int[10]; // ��
	static int[] vd1 = new int[20]; // �Խ���1
	static int[] vd2 = new int[20]; // �Խ���2
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
				//3Ϊ�ڻʺ�p����2��Ϊ�׻ʺ󣬵������ڰ׺ڻʺ󣬺͵�ͼ�ϲ�Ϊ0�ſ���dfs
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
