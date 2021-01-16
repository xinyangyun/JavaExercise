package JZ;

import java.util.ArrayList;

public class JZ41和为s的连续正数序列 {

	public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
		
		//利用滑动窗口解题，滑动窗口就是在一个有序数组中的一个子数组可以随意移动
		//然后取一个解
		
		int i = 1;//滑动窗口的左边界
		int j = 1;//滑动窗口的右边界
		
		int sum2  = 0;//滑动窗口中
		ArrayList<ArrayList<Integer>> res = new ArrayList<>();
		
		while (i <= sum/2) { //如果i=sum/2则i+i=sum了
			if (sum2 <  sum) {
				//右边界向右移动
				sum2+=j;
				j++;
			}
			else if (sum2 > sum) {
				//左边界向左移动
				sum2 -= i;
				i++;
			}
			else {
				//记录结果
				ArrayList<Integer> arr = new ArrayList<>();
				for (int k = i;k < j;k++) {
					arr.add(k);
				}
				res.add(arr);
				//左边界向右移动
				sum2-=i;
				i++;
			}
		}
		
		return res;
	}

}
