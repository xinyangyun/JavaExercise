package 快速提升代码能力;

import java.util.Arrays;
import java.util.Scanner;

public class 蒜头君的随机数 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] s = new int[105];
		int[] t = new int[105];
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			s[i] = sc.nextInt();
		}
		Arrays.sort(s,0,n);
		int sum = 0;
		for (int i = 0; i < n; i++) {
			if (s[i] != s[i+1]) {
				t[sum++] = s[i];
			}
		}
		System.out.println(sum);
		for (int i = 0; i < sum; i++) {
			if (i != sum-1) {
				System.out.print(t[i]+" ");
			}else {
				System.out.println(t[i]); 
			}
		}
	}
}
