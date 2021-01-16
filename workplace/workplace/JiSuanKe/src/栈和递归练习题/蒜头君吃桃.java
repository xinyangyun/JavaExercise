package Õ»ºÍµİ¹éÁ·Ï°Ìâ;

import java.util.Scanner;

public class ËâÍ·¾ı³ÔÌÒ {
	static int n;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		System.out.println(dg(1));
	}

	static int dg(int x) {
		if (x == n) {
			return 1;
		} else {
			return 2 * dg(x + 1) + 2;
		}
	}
}
