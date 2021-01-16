package 动态规划;

import java.util.Vector;

public class 最大子序和 {
	public static void main(String[] args) {
		int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
		
		System.out.println(maxSubArray(arr)); 
 	}
	
	static int maxSubArray(int[] arr) {
		int max = Integer.MIN_VALUE;
		
		int[] dp = new int[arr.length];
		dp[0] = arr[0];

		for (int i = 1; i < dp.length; i++) {
			dp[i] = Math.max(dp[i-1]+arr[i], arr[i]);
			if(dp[i] > max) {
				max = dp[i];
			}
		}
		return max;
	}
}
