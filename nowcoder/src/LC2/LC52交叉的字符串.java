package LC2;

public class LC52������ַ��� {

	public boolean isInterleave(String s1, String s2, String s3) {
		int len1 = s1.length();
		int len2 = s2.length();
		int len3 = s3.length();
		if (len3 != len1 + len2) {
			return false;
		}
		char[] chs1 = s1.toCharArray();
		char[] chs2 = s2.toCharArray();
		char[] chs3 = s3.toCharArray();
		// dp[i][j]���� chs[0...i] chs[0...j]�ܷ�˳��ƥ��chs3[i+j]
		boolean[][] dp = new boolean[len1 + 1][len2 + 1];
		// ��ʼ�� s1��ȡ0���ַ���s2��ȡ0���ַ� ƥ��s3��0��ʼ��0���ַ� �϶�ƥ��true
		dp[0][0] = true;
		// s1��ȡ0��s2��ȡi����ȥ��s3��0+i��ƥ��
		for (int i = 1; i < len2 + 1; i++) {
			dp[0][i] = dp[0][i - 1] && chs2[i - 1] == chs3[i - 1];
		}
		// s2��ȡ0��s1��ȡi��,ȥ��s3��0+i��ƥ��
		for (int i = 1; i < len1 + 1; i++) {
			dp[i][0] = dp[i - 1][0] && chs1[i - 1] == chs3[i - 1];
		}
		for (int i = 1; i < len1 + 1; i++) {
			for (int j = 1; j < len2 + 1; j++) {
				dp[i][j] = dp[i - 1][j] && (chs3[i + j - 1] == chs1[i - 1])
						|| dp[i][j - 1] && (chs3[i + j - 1] == chs2[j - 1]);
			}
		}
		return dp[len1][len2];
	}

}
