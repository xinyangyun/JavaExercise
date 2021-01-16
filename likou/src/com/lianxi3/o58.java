package com.lianxi3;

public class o58 {
	public static void main(String[] args) {
		String s = "  444 ";
		System.out.println(s.trim());
		
		String reverseWords = reverseWords("a good   example");
		System.out.println(reverseWords);
	}

	public static String reverseWords(String s) {

		String[] strs = s.trim().split(" ");//删除首位空格，分隔字符串
		StringBuilder res = new StringBuilder();
		for (int i = strs.length-1; i >= 0; i--) {
			if (strs[i].equals("")) continue;//遇到空格则跳过
			res.append(strs[i]+ " ");//将单词拼接至StringBuiler
		}
		
		return res.toString().trim();//将stringbuilder转换为字符串，删除尾部空格，并返回
	}
}
