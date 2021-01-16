package bylance;

import java.util.Scanner;

public class o7前缀和 {

	static int[] pre = new int[1000005];

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			int num = sc.nextInt();
			pre[i] = pre[i - 1] + num;   //计算第0到i的和
		}

		int[] arr = new int[m];
		
		for (int i = 0; i < m; i++) {
			int l = sc.nextInt();
			int r = sc.nextInt();
//			System.out.println(pre[r] - pre[l - 1]);  //r的总和 减去 l-1的总和就是l 到r的总和
			arr[i] = pre[r] - pre[l - 1];
		}
		
		for (int i = 0;i < arr.length;i++) {
			System.out.println(arr[i]);
		}

	}

}
