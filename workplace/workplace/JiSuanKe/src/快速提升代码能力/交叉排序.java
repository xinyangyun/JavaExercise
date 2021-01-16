package 快速提升代码能力;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class 交叉排序 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer[] a = new Integer[100005];
		int n = sc.nextInt();
		int l1 = sc.nextInt();
		int r1 = sc.nextInt();
		int l2 = sc.nextInt();
		int r2 = sc.nextInt();
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		
		Arrays.sort(a, l1 - 1, r1);
		Arrays.sort(a, l2 - 1, r2, new cmp_6());
		
		for (int i = 0; i < n; i++) {
			if (i!= n-1) {
				System.out.print(a[i] + " ");
			}else {
				System.out.println(a[i]);
			}
		}
	}
}

class cmp_6 implements Comparator<Integer> {

	@Override
	public int compare(Integer a, Integer b) {
		return b - a;
	}
}
