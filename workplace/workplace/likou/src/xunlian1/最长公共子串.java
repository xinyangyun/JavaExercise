package xunlian1;

import java.util.Scanner;

public class 最长公共子串 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] strs = {"flower","flow","flight"};
		String longest = longest(strs);
		System.out.println(longest);
	}
	
	public static String longest(String[] strs) {
		if (strs == null || strs.length == 0)return "";
		String reg = strs[0];
		for (String str : strs) {
			while(!str.startsWith(reg)) {
				if (reg.length() == 1) {
					return "";
				}
				reg = reg.substring(0,reg.length()-1);
			}
		}
		return reg;
	}
}
