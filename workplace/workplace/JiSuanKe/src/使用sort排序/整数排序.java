package 使用sort排序;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class 整数排序 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer[] arr = new Integer[110];
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr, 0, n, new cmp());
		for (int i = 0; i < n; i++) {
			if (i!= n-1) {
				System.out.print(arr[i]+" ");
			}else {
				System.out.println(arr[i]);
			}
		}
	}

}

class cmp implements Comparator<Integer> {

	@Override
	public int compare(Integer a, Integer b) {
		if (a % 3 != b % 3) {
			return a % 3 - b % 3;
		}
		return a - b;
	}
}