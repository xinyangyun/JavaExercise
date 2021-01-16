package xunlian1;

import java.util.Arrays;
import java.util.Scanner;

public class 最接近的三数之和 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int target = sc.nextInt();
		int[] arr = new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int ans = 10000;
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				for (int j2 = j; j2 < arr.length; j2++) {
					int sum = arr[i] + arr[j] +arr[j2];
					System.out.println(sum);
					int t = Math.abs(sum-target);
					if (t < ans) {
						ans = t;
					}
					
				}
			}
		}
		
		System.out.println(ans);
		
		
	}
}
