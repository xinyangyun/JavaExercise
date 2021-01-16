package com.lianxi3;

import java.util.ArrayList;
import java.util.List;

public class o57II {
	public static void main(String[] args) {
		
	}
	
	public int[][] findContinuousSequence(int target) {
		//利用滑动窗口解题，滑动窗口就是在一个有序数组中的一个子数组可以随意移动然后
		//取一个解
		
		int i = 1;//滑动窗口的左边界
		int j = 1;//滑动窗口的右边界
		int sum = 0;//滑动窗口中
		List<int[]> res = new ArrayList<>();
		
		while (i <= target/2) {
			if (sum < target) {
				//右边界向右移动
				sum += j;
				j++;
			}else if (sum > target) {
				//左边界向左移动
				sum -= i;
				i++;
			}else {
				//记录结果
				int[] arr = new int[j-i];
				for (int k = i; k < j; k++) {
					arr[k-i] = k;
				}
				res.add(arr);
				//左边界向右移动
				sum-=i;
				i++;
			}
			
		}
		return res.toArray(new int[res.size()][]);
    }
}
