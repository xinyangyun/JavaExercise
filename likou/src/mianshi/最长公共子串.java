package mianshi;

import java.util.Scanner;

public class 最长公共子串 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next().toLowerCase();
		String str2 = sc.next().toLowerCase();
		System.out.println(getMaxSubtring(str1, str2));
	}
	
	public static String getMaxSubtring(String maxString,String minString) {
		//保证第一个字符串是长的，第二个是短的
		if (minString.length() > maxString.length()) {
			return getMaxSubtring(minString, maxString);
		}
		//判断一下，是否直接包含，如果是的话就不用进行阵列转换
		if (maxString.contains(minString)) {
			return minString;
		}
		//取出长度，转换相对应的矩阵。长为y，短为x
		int maxLength = maxString.length();
		int minLength = minString.length();
		//
		int[][] conver = new int[minLength][maxLength];
		int maxValue = 0;//最大的值
		int maxIndex = 0;//最大的索引
		//
		for (int i = 0; i < minLength; i++) {
			for (int j = 0; j < maxIndex; j++) {
				if (minString.charAt(i)==maxString.charAt(j)) {
					if (i==0||j==0) {
						conver[i][j] = 1;
					}else {
						conver[i][j] = conver[i-1][j-1]+1;
						if(maxValue<conver[i][j]) {
							maxValue = conver[i][j];
							maxIndex = i;
						}
					}
				}else {
					conver[i][j]= 0;
				}
			}
		}
		if (maxValue!=0&&maxIndex!=0) {
			return minString.substring(maxIndex-maxValue+1,maxValue);
		}
		return null;
	}

	static int f(String str1, String str2) {
		int len1 = str1.length();
		int len2 = str2.length();
		int[][] dp = new int[len1 + 1][len2 + 1];
		for (int i = 0; i <= len1; i++) {
			for (int j = 0; j <= len2; j++) {
				dp[i][j] = 0;
			}
		}
		
		for (int i = 1; i <= len1; i++) {
			for (int j = 1; j <= len2; j++) {
				if (str1.charAt(i-1) == str2.charAt(j-1)) {
					dp[i][j] = dp[i-1][j-1]+1;
				}else {
					dp[i][j] = 0;
				}
			}
		}
		
		int max = 0;
		for (int i = 0; i <= len1; i++) {
			for (int j = 0; j <= len2; j++) {
				if (dp[i][j] > max) {
					max = dp[i][j];
				}
			}
		}
		return max;
	}

}
