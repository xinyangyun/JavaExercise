package com.lianxi3;

public class o51 {
	public static void main(String[] args) {
		int[] arr = {7,5,6,4};
		System.out.println(reversePairs(arr));
	}
	
	public static int reversePairs(int[] nums) {
		
		int res = 0;
		
		for (int i = 0; i < nums.length; i++) {
			int x = nums[i];
			for (int j = i+1; j < nums.length; j++) {
				if (x > nums[j]) {
					res++;
				}
			}
		}
		
		return res;
    }
}
