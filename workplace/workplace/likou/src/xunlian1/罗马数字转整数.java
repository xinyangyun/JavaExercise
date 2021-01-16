package xunlian1;

import java.util.Scanner;

public class 罗马数字转整数 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int sum = 0;
		int prenum = getValue(str.charAt(0));
		for (int i = 1; i < str.length(); i++) {
			int num = getValue(str.charAt(i));
			if (prenum < num) {
				sum -= prenum;
			} else {
				sum += prenum;
			}
			prenum = num;
		}
		sum += prenum;
		System.out.println(sum);
	}

	public static int getValue(char ch) {
		switch (ch) {
		case 'I':
			return 1;
		case 'V':
			return 5;
		case 'X':
			return 10;
		case 'L':
			return 50;
		case 'C':
			return 100;
		case 'D':
			return 500;
		case 'M':
			return 1000;
		default:
			return 0;
		}
	}

}
