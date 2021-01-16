package LC2;

public class LC59���� {

	public int numDecodings(String s) {
		if (s == null || s.length() == 0 || s.charAt(0) == '0')
			return 0;
		for (int i = 0; i < s.length(); i++) {
			if (!Character.isDigit(s.charAt(i)))
				return 0;
		}
		// dp[i]��ʾs[0-i-1]�����ж����ֽ��뷽ʽ
		// ���Ʒ��̣����1 <= s[i-1] <= 9,��dp[i] += dp[i-1]
		// ��� 10 <= s[i-2-i-1] <=26 ��dp[i] += dp[i-2]
		int[] dp = new int[s.length() + 1];
		dp[0] = 1;
		dp[1] = 1;
		for (int i = 2; i <= s.length(); i++) {
			if (s.charAt(i - 1) >= '1' && s.charAt(i - 1) <= '9') {
				dp[i] += dp[i - 1];
			}
			if (Integer.valueOf(s.substring(i - 2, i)) >= 10 && Integer.valueOf(s.substring(i - 2, i)) <= 26) {
				dp[i] += dp[i - 2];
			}
		}
		return dp[s.length()];
	}

}
