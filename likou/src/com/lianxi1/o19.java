package com.lianxi1;

import java.util.Scanner;

/*��ʵ��һ����������ƥ�����'. '��'*'��������ʽ��ģʽ�е��ַ�'.'��ʾ����һ���ַ���
��'*'��ʾ��ǰ����ַ����Գ�������Σ���0�Σ����ڱ����У�ƥ����ָ�ַ����������ַ�ƥ������ģʽ��
���磬�ַ���"aaa"��ģʽ"a.a"��"ab*ac*a"ƥ�䣬����"aa.a"��"ab*a"����ƥ�䡣*/

/*����:
s = "aa"
p = "a"
���: false
����: "a" �޷�ƥ�� "aa" �����ַ�����
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
		 * s��p����Ϊ�ա��յĳ��Ⱦ���0��������Щ������Ѿ��жϹ��ˣ�ֻ��Ҫ�ж��Ƿ�Ϊnull���� if(p.length()==0&&s.length()==0)
		 * return true;
		 */
		if (s == null || p == null) {
			return false;
		}
		int rows = s.length();
		int columns = p.length();
		boolean[][] dp = new boolean[rows + 1][columns + 1];
		// s��p������Ϊ�գ��϶��ǿ���ƥ��ģ�ͬʱ����ȡtrue��ԭ����
		// ��s=a��p=a����ôdp[1][1] = dp[0][0]�����dp[0][0]����Ϊtrue��
		dp[0][0] = true;
		for (int j = 1; j <= columns; j++) {
			// p[j-1]Ϊ*���԰�j-2��j-1�����ַ�ɾȥ��ֻ��[0,j-3]��Ϊtrue�ſ���
			// ���dp[j-2]ҲҪΪtrue���ſ���˵��ǰj��Ϊtrue
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
