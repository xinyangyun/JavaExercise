package com.lianxi2;

public class o42 {
	public static void main(String[] args) {
		int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		System.out.println(maxSubArray(arr));
	}

	public static int maxSubArray(int[] nums) {
		
		int sum = 0;
		int max = Integer.MIN_VALUE;

//		for (int i = 0; i < nums.length; i++) {
//			if (sum <= 0) {
//				sum = nums[i];
//			}else {
//				sum += nums[i];
//			}
//			max = Math.max(max, sum);
//		}
		
		for (int num : nums) {
			if (sum <= 0 ) {
				sum = num;
			}else {
				sum += num;
			}
			max = Math.max(max, sum);
		}
		
		return max;
	}
}
