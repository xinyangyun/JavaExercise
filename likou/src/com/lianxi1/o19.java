package com.lianxi1;

import java.util.Scanner;

/*请实现一个函数用来匹配包含'. '和'*'的正则表达式。模式中的字符'.'表示任意一个字符，
而'*'表示它前面的字符可以出现任意次（含0次）。在本题中，匹配是指字符串的所有字符匹配整个模式。
例如，字符串"aaa"与模式"a.a"和"ab*ac*a"匹配，但与"aa.a"和"ab*a"均不匹配。*/

/*输入:
s = "aa"
p = "a"
输出: false
解释: "a" 无法匹配 "aa" 整个字符串。
*/
public class o19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String p = sc.next();
		System.out.println(isMatch(s, p));
	}

	public static boolean isMatch(String s, String p) {
		/*
		 * s和p可能为空。空的长度就是0，但是这些情况都已经判断过了，只需要判断是否为null即可 if(p.length()==0&&s.length()==0)
		 * return true;
		 */
		if (s == null || p == null) {
			return false;
		}
		int rows = s.length();
		int columns = p.length();
		boolean[][] dp = new boolean[rows + 1][columns + 1];
		// s和p两个都为空，肯定是可以匹配的，同时这里取true的原因是
		// 当s=a，p=a，那么dp[1][1] = dp[0][0]。因此dp[0][0]必须为true。
		dp[0][0] = true;
		for (int j = 1; j <= columns; j++) {
			// p[j-1]为*可以把j-2和j-1处的字符删去，只有[0,j-3]都为true才可以
			// 因此dp[j-2]也要为true，才可以说明前j个为true
			if (p.charAt(j - 1) == '*' && dp[0][j - 2]) {
				dp[0][j] = true;
			}
		}

		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= columns; j++) {
				char nows = s.charAt(i - 1);
				char nowp = p.charAt(j - 1);

				if (nows == nowp) {
					dp[i][j] = dp[i - 1][j - 1];
				} else {
					if (nowp == '.')
						dp[i][j] = dp[i - 1][j - 1];
					else if (nowp == '*')
					{
						if (j >= 2) {
							char nowpLast = p.charAt(j - 2);
							if(nowpLast==nows||nowpLast=='.') {
								dp[i][j] = dp[i-1][j]||dp[i][j-1];
							}
                            dp[i][j] = dp[i][j]||dp[i][j-2];
						}
					} 
					else
						dp[i][j] = false;
				}
			}
		}
		return dp[rows][columns];
	}
}
