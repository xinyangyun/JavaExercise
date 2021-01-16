package LC;

public class LC36不同的子序列 {

	public int numDistinct(String S, String T) {
		int[][] num = new int[S.length()+1][T.length()+1];
		for (int i = 0;i <= S.length();i++) {
			num[i][0] = 1;
		}
		for (int i = 1;i <= S.length();i++) {
			for (int j = 1;j <= T.length();j++) {
				if (S.charAt(i-1) == T.charAt(j-1)) {
					num[i][j] = num[i-1][j] + num[i-1][j-1];
				}else {
					num[i][j] = num[i-1][j];
				}
			}
		}
		return num[S.length()][T.length()];
	}

}
