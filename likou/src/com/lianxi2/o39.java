package com.lianxi2;

public class o39 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 2, 2 };

		System.out.println(majorityElement(arr));

	}

	//投票方案
	public static int majorityElement(int[] nums) {
		int x = 0, votes = 0;

		for (int num : nums) {
			if (votes == 0)
				x = num; // 如果众数位票位0，那么新的就设为众数
			votes += num == x ? 1 : -1; // 如果众数不为0，且众数等于num票就+1，否则减一
		}

		return x;
	}
}
