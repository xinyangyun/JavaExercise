package com.lianxi5;

public class o44����������ĳһλ������ {
	public static void main(String[] args) {

	}

	public int findNthDigit(int n) {
		int digit = 1;// λ��
		int start = 1;// ���Ŀ�ʼ
		long count = 9;// ��������
		while (n > count) {
			n -= count;
			digit += 1;
			start *= 10;
			count = digit * start * 9;
		}
		long num = start + (n - 1) / digit; // ����
		return Long.toString(num).charAt((n - 1) % digit) - '0'; // ����ֵ������num�еĵڣ�n-1��%dightλ��
	}

}
