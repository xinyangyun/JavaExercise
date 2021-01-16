package com.lianxi3;

public class o53 {
	public static void main(String[] args) {

	}

	public int search(int[] nums, int target) {
		
		//搜索右边界right
		int i = 0,j = nums.length-1;
		while(i <= j) {
			int m = (i+j)/2;
			if (nums[m]<=target) i = m+1;
			else  j = m-1;
		}
		int right = i;
		//若数组中无target，则提前返回
		if (j >=0 && nums[j]!=target) return 0;
		//搜索左边界right
		i = 0;j = nums.length-1;
		while (i <= j) {
			int m = (i+j)/2;
			if (nums[m] < target) i = m+1;
			else j = m-1;
		}
		int left = j;
		return right-left-1;
	}
}
