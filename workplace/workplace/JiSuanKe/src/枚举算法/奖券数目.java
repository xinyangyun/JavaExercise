package 枚举算法;

import java.util.Scanner;

public class 奖券数目 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int sum = 0;
		for (int i = n; i <= m; i++) {
			if (judge(i)) {
				sum++;
			}
		}
		System.out.println(sum);
	}
	
	static boolean judge(int x) {
		while (x != 0) {
			if (x %10 == 4) {
				return false;
			}else {
				x/=10;
			}
		}
		return true;
	}
}
