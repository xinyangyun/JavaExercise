package string;

public class lc1143最长公共子序列 {
	public static void main(String[] args) {
		String s1="abce";
		String s2 = "ace";
		System.out.println(longestCommonSubsequence(s1, s2));
	}
	
	public static int longestCommonSubsequence(String text1, String text2) {
		
		int m = text1.length(),n = text2.length();
		
		int[][] dp = new int[m+1][n+1];
		
		for (int i = 1; i < m+1; i++) {  
			for (int j = 1; j < n+1; j++) {
				//获取两个字符串
				char c1 = text1.charAt(i-1),c2 = text2.charAt(j-1);
				if (c1==c2) {
					dp[i][j] = dp[i-1][j-1]+1;
				}else {
					dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
				}
			}
		}
		
		return dp[m][n];
    }
}
