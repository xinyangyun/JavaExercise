package 快速提升代码能力;

import java.util.Scanner;

public class 斐波那契数列 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int mod = (int) 1e9 + 7;
		int a = 1, b = 1;
		for (int i = 3; i <= n; i++) {
			int t = b;
			b = (a + b) % mod;
			a = t;
		}
		System.out.println(b);
	}
}
