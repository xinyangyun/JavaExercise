package com.lianxi3;

import java.util.Arrays;

public class o61 {
	public static void main(String[] args) {
		
	}
	
	public boolean isStraight(int[] nums) {
		
		int joker = 0;
		
		Arrays.sort(nums); //数组排序
		
		for (int i = 0; i < 4; i++) {   
			if (nums[i] == 0) joker++;   //统计大小王数量
			else if (nums[i] == nums[i+1]) return false; //若有重复，提返回
		}
		
		return nums[4] - nums[joker] < 5;
    }
}
