package 枚举算法;

import java.util.Scanner;

public class 回文数字 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean f = false;
		for (int i = 10000; i <= 999999; i++) {
			if (sum(i) == n && isHui(i)) {
				f = true;
				System.out.println(i);
			}
		}
		if (!f) {
			System.out.println(-1);
		}
	}

	public static int sum(int x) {
		int sum = 0;
		while (x > 0) {
			sum += x % 10;
			x /= 10;
		}
		return sum;
	}

	public static boolean isHui(int x) {
		int[] arr = new int[20];
		int length = 0;
		while (x != 0) {
			arr[length++] = x % 10;
			x /= 10;
		}
		for (int i = 0; i < length / 2; i++) {
			if (arr[i] != arr[length - i - 1]) {
				return false;
			}
		}
		return true;
	}
}
