package com.lianxi3;

public class o53 {
	public static void main(String[] args) {

	}

	public int search(int[] nums, int target) {
		
		//�����ұ߽�right
		int i = 0,j = nums.length-1;
		while(i <= j) {
			int m = (i+j)/2;
			if (nums[m]<=target) i = m+1;
			else  j = m-1;
		}
		int right = i;
		//����������target������ǰ����
		if (j >=0 && nums[j]!=target) return 0;
		//������߽�right
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
