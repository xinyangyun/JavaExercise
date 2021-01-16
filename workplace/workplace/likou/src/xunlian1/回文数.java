package xunlian1;

import java.util.Scanner;

public class »ØÎÄÊı {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		Boolean check = check(x);
		System.out.println(check);
	}
	
	public static Boolean check(int x) {
		if (x < 0) {
			return false;
		}
		int con = 0;
		int[] s = new int[1005];
		while (x!=0) {
			s[con++] = x%10;
			x/=10;
		}
		for (int i = 0; i < con/2; i++) {
			if(s[i] != s[con-i-1]) {
				return false;
			}
		}
		return true;
	}
}
