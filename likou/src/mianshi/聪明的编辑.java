package mianshi;

import java.util.Scanner;

/*2
helloo
wooooooow

hello
woow*/


public class 聪明的编辑 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(test(sc.next()));
	}
	
	public static String test(String s) {
		char[] str = s.toCharArray();
		StringBuilder sb = new StringBuilder();
		int k = 0;
		for (int i = 0; i < str.length; i++) {
			str[k] = str[i];
			sb.append(str[k]);
			k++;
			//先满足规则1，三个连续的情况
			if (k >= 3 && str[k-3] == str[k-2] && str[k-2] == str[k-1]) {
				sb.deleteCharAt(k-1);
				k--;
			}
			//再满足规则2,aabb的情况
			if (k >= 4 && str[k-4] == str[k-3] && str[k-2] == str[k-1]) {
				sb.deleteCharAt(k-1);
				k--;
			}
		}
		return String.valueOf(sb);
	}
}
