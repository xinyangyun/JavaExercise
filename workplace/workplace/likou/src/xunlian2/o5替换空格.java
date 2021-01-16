package xunlian2;

import java.util.Scanner;

public class o5Ìæ»»¿Õ¸ñ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		String str = sc.next();
		
		String str = "We are happy.";
		
		System.out.println(replaceSpace(str));
		
	}

	public static String replaceSpace(String s) {
		
		
		char[] arr = s.toCharArray();
		
		String str = "";
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i] ==' ') {
				str+="%20";
			}else {
				str+=arr[i];
			}
			
		}
		
		return str;
	}
}
