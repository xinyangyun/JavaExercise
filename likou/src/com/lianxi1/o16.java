package com.lianxi1;

import java.util.Scanner;

/*ʵ�ֺ���double Power(double base, int exponent)����base��exponent�η�������ʹ�ÿ⺯����ͬʱ����Ҫ���Ǵ������⡣

����: 2.00000, 10
���: 1024.00000*/

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

		
//		������
		while (b > 0) {
			if (b % 2 == 1) {
				sum *= x;
			}
			x *= x;
			b >>= 1;//����һλ
		}
		return sum;
	}

}
