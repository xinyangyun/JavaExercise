package com.lianxi2;

public class o43 {
	public static void main(String[] args) {
		System.out.println(countDigitOne(12));
	}

	//��Ϊ����������high��cur��low,����һ��digit
	//��ʽΪcur = 0��res += high * digit
	//cur = 1,res += high * digit + low +1
	//cur ��������� res += (high + 1) * digit
	public static int countDigitOne(int n) {

		int digit = 1, res = 0;
		int high = n / 10, cur = n % 10, low = 0;

		while (high != 0 || cur != 0) {
			if (cur == 0)
				res += high * digit;
			else if (cur == 1)
				res += high * digit + low + 1;
			else
				res += (high + 1) * digit;
			low += cur * digit;
			cur = high % 10;
			high /= 10;
			digit *= 10;
		}

		return res;
	}
}
