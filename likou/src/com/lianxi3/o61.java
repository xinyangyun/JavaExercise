package com.lianxi3;

import java.util.Arrays;

public class o61 {
	public static void main(String[] args) {
		
	}
	
	public boolean isStraight(int[] nums) {
		
		int joker = 0;
		
		Arrays.sort(nums); //��������
		
		for (int i = 0; i < 4; i++) {   
			if (nums[i] == 0) joker++;   //ͳ�ƴ�С������
			else if (nums[i] == nums[i+1]) return false; //�����ظ����᷵��
		}
		
		return nums[4] - nums[joker] < 5;
    }
}
