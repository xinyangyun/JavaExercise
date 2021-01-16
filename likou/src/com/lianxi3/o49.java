package com.lianxi3;

public class o49 {
	public static void main(String[] args) {
		
	}
	
	public int nthUglyNumber(int n) {
//		1 2 3 5 // 这一行里, 2,3,5分别是1的三个乘积
//		2 4 6 10 // 同理, 4,6,10是2的三个乘积
//		3 6 9 15 // ....
//		4 8 12 20

		//从上面的代码中我们可以看出有很多重复的，所以我们需要排除这些重复的然后记录每一个丑数
		int a = 0,b = 0,c = 0;
		int[] dp = new int[n];
		
		dp[0] = 1;  //第一个丑数
		
		for (int i = 1; i < n; i++) {  //i表示第i个丑数
			int n2 = dp[a] * 2;//表示因子为2
			int n3 = dp[b] * 3;//表示因子为3
			int n5 = dp[c] * 5;//表示因子为5
			dp[i] = Math.min(Math.min(n2, n3), n5);//从这三个中取最小的一个
			if (dp[i] == n2) a++;
			if (dp[i] == n3) b++;
			if (dp[i] == n5) c++;
		}
		
		return dp[n-1];
    }
	
}
