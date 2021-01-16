package dp;

import java.util.Arrays;

public class lc787k站中转内最便宜的航班 {
	public static void main(String[] args) {

	}

	public int findCheapestPrice(int n, int[][] flights, int src, int dst, int K) {

		// dp[i][k]是经过该k个中转站后到达i的最小费用
		int[][] dp = new int[n][K + 1];

		// 循环初始化整个二维数组
		for (int i = 0; i < n; i++)
			Arrays.fill(dp[i], Integer.MAX_VALUE);

		// 利用flights中的信息初始化src可直达的班次
		for (int[] flight : flights) {
			if (flight[0] == src) {
				dp[flight[1]][0] = flight[2];
			}
		}

		// 循环初始化数组中的dst ==src的行
		for (int i = 0; i <= K; i++) {
			dp[src][i] = 0;
		}

		// 动态规划状态转移方程，开始填表
		// 直达的已经初始化（即k=0）的情况，现在从k=1开始，即只有一个中转站开始
		for (int k = 1; k <= K; k++) {
			for (int[] flight : flights) {
				// 结合题目理解
				if (dp[flight[0]][k - 1] != Integer.MAX_VALUE) {
					dp[flight[1]][k] = Math.min(dp[flight[1]][k], dp[flight[0]][k - 1] + flight[2]);
				}
			}
		}

		return dp[dst][K] == Integer.MAX_VALUE ? -1 : dp[dst][K];
	}
}
