package ö���㷨;

import java.util.Scanner;

public class ˫�ڹ� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[105];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int ans = 10000;
		for (int i = 0; i < n; i++) {
			for (int j = i+1; j < n; j++) {
				int temp = Math.abs(arr[i]-arr[i+1]);
				if (temp < ans) {
					ans = temp;
				}
			}
		}
		System.out.println(ans);
	}
}
