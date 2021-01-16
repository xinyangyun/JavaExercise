package com.lianxi1;

import java.util.Scanner;

//输入数字 n，按顺序打印出从 1 到最大的 n 位十进制数。比如输入 3，则打印出 1、2、3 一直到最大的 3 位数 999。

/*输入: n = 1
输出: [1,2,3,4,5,6,7,8,9]*/

public class o17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = printNumbers(sc.nextInt());
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static int[] printNumbers(int n) {
		int size = 1;
		for (int i = 1; i <= n; i++) {
			size*=10;
		}
		int[] arr = new int[size-1];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
		}
		return arr;
    }
}
