package com.lianxi2;

public class o39 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 2, 2 };

		System.out.println(majorityElement(arr));

	}

	//ͶƱ����
	public static int majorityElement(int[] nums) {
		int x = 0, votes = 0;

		for (int num : nums) {
			if (votes == 0)
				x = num; // �������λƱλ0����ô�µľ���Ϊ����
			votes += num == x ? 1 : -1; // ���������Ϊ0������������numƱ��+1�������һ
		}

		return x;
	}
}
