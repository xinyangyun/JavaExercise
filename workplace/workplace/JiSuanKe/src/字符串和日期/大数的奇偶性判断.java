package 字符串和日期;

import java.util.Scanner;

public class 大数的奇偶性判断 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int n = str.charAt(str.length() - 1);
		if (n % 2 == 0) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}
}
