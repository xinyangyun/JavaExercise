package xunlian3;

import java.util.Arrays;

public class o40 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,6,4,2};
		int[] leastNumbers = getLeastNumbers(arr, 3);
		
		for (int i = 0; i < 3; i++) {
			System.out.println(leastNumbers[i]);
		}
	}
	
	public static int[] getLeastNumbers(int[] arr, int k) {
		int[] a = new int[k];
		Arrays.sort(arr);
		
		for (int i = 0; i < k; i++) {
			a[i] = arr[i];
		}
		
		return a;
    }
}
