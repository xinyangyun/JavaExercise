package xunlian2;

import java.util.Scanner;

public class o3数组中重复的数字 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		boolean f = false;
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = i+1; j < arr.length; j++) {
//				if (arr[i] == arr[j]) {
//					f = true;
//					System.out.println(arr[i]);
//					break;
//				}
//			}
//			if (f) break;
//		}

		System.out.println(test(arr));

	}

	public static int test(int[] nums) {
//		int s = 0;
//		boolean f = false;
//		for (int i = 0; i < nums.length; i++) {
//			for (int j = i+1; j < nums.length; j++) {
//				if (nums[i] == nums[j]) {
//					s = nums[i];
//					f = true;
//					break;
//				}
//			}
//			if (f) break;
//		}
//		return s;

		int n = nums.length;

		for (int i = 1; i < n; i++) {
			for (int j = 0; j < i; j++) {
				if (nums[i] == nums[j])
					return nums[i];
			}
		}

		return -1;

	}
}
