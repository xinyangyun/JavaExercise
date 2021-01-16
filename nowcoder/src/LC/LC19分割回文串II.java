package LC;

public class LC19分割回文串II {

	public int minCut(String s) {

		if (s == null || s.length() == 0) {
			return 0;
		}

		int[] dp = new int[s.length()];
		dp[0] = 0;

		for (int i = 1; i < s.length(); i++) {
			dp[i] = isPalindrome(s.substring(0, i + 1)) ? 0 : i;
			if (dp[i] != 0) { // dp[i] = 0时不需要内循环
				for (int j = i; j > 0; j--) {
					if (isPalindrome(s.substring(j, i + 1))) {
						dp[i] = Math.min(dp[i], dp[j - 1] + 1); //dp[j-1]表示上一个
					}
				}
			}
		}

		return dp[s.length() - 1];
	}

	public static boolean isPalindrome(String s) {
		int begin = 0;
		int end = s.length() - 1;
		while (begin < end) {
			if (s.charAt(begin++) != s.charAt(end--)) {
				return false;
			}
		}
		return true;
	}

}
