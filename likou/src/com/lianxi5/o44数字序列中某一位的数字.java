package com.lianxi5;

public class o44数字序列中某一位的数字 {
	public static void main(String[] args) {

	}

	public int findNthDigit(int n) {
		int digit = 1;// 位数
		int start = 1;// 数的开始
		long count = 9;// 数的总数
		while (n > count) {
			n -= count;
			digit += 1;
			start *= 10;
			count = digit * start * 9;
		}
		long num = start + (n - 1) / digit; // 求数
		return Long.toString(num).charAt((n - 1) % digit) - '0'; // 返回值，就是num中的第（n-1）%dight位数
	}

}
