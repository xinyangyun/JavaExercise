package 字符串和日期;

import java.util.Scanner;

public class 最长的名字 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int max = 0;
		String str = "";
		
		for (int i = 0; i < n; i++) {
			String name = sc.next();
			if (name.length() > max ) {
				max = name.length();
				str = name;
			}
		}
		
		System.out.println(str);
	}
	
}
