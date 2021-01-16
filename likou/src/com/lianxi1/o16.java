package com.lianxi1;

import java.util.Scanner;

/*实现函数double Power(double base, int exponent)，求base的exponent次方。不得使用库函数，同时不需要考虑大数问题。

输入: 2.00000, 10
输出: 1024.00000*/

public class o16 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(myPow(sc.nextDouble(), sc.nextInt()));
	}

	public static double myPow(double x, int n) {
		if (x == 0)
			return 0;
		long b = n;
		double sum = 1.0;

		if (b < 0) {
			x = 1 / x;
			b = -b;
		}

		
//		快速幂
		while (b > 0) {
			if (b % 2 == 1) {
				sum *= x;
			}
			x *= x;
			b >>= 1;//右移一位
		}
		return sum;
	}

}
