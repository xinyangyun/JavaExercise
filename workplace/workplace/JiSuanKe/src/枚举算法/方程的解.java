package ö���㷨;

import java.util.Scanner;

public class ���̵Ľ� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int a = 1; a*a < n; a++) {
			for (int b = a + 1; b < Math.sqrt(n); b++) {
				int c0 = n - a*a - b*b;
				int c = (int) Math.sqrt(c0);
				if (c > b && c *c == c0) {
					System.out.println(a+ " " + b + " " +c);
				}
			}
		}
	}
}
