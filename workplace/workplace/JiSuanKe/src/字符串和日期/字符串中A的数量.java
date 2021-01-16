package 字符串和日期;

import java.util.Scanner;

public class 字符串中A的数量 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		int num = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i)=='A') {
				num++;
			}
		}
		System.out.println(num);
		
	}
}
