package com.lianxi3;

public class o58II {
	public static void main(String[] args) {
		String reverseLeftWords = reverseLeftWords("abcdefg", 2);
		System.out.println(reverseLeftWords);
	}
	
	public static String reverseLeftWords(String s, int n) {
		char[] chs = s.toCharArray();
		StringBuilder res = new StringBuilder();
		
		for (int i = n; i < chs.length; i++) {
			res.append(chs[i]);
		}
		for (int i = 1; i <= n; i++) {
			res.append(chs[i-1]);
		}
		
		return res.toString();
    }
}
