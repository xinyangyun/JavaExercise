package com.lianxi1;

import java.util.Scanner;

//�������� n����˳���ӡ���� 1 ������ n λʮ���������������� 3�����ӡ�� 1��2��3 һֱ������ 3 λ�� 999��

/*����: n = 1
���: [1,2,3,4,5,6,7,8,9]*/

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
