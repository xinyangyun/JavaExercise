package 枚举算法;

import java.util.Scanner;

public class 装饰效果 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[1005];
		int sum = 0;
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			int ans = 0;
			if (arr[i] < 0) {
				continue;
			}
			for (int j = i; j < n; j++) {
				ans += arr[j];
				if (ans > sum) {
					sum = ans;
				}
			}
		}
		System.out.println(sum);
	}
}
