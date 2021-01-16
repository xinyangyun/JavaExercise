package com.lianxi3;

public class o66 {
	public static void main(String[] args) {

	}

	public int[] constructArr(int[] a) {

		//��Ŀ��˼���˺�B��һ�����±����
		//���ǽ���Ϊ2������һ��������һ��������
		//�ֱ������left[i] = left[i-1] * a[i-1]
		//          right[i] = right[i+1] * a[i+1]
		//���ans[i] = left[i] * right[i]
		
		if (a == null || a.length == 0)
			return a;

		int len = a.length;

		int[] left = new int[len];
		int[] right = new int[len];

		left[0] = right[len - 1] = 1;

		for (int i = 1; i < len; i++) {
			left[i] = left[i - 1] * a[i - 1];
		}
		
		for (int i = len - 2; i >= 0; i--) {
			right[i] = right[i+1] * a[i+1];
		}
		
		int[] ans = new int[len];
		
		for (int i = 0; i < len; i++) {
			ans[i] = left[i] * right[i];
		}

		return ans;
	}
}
