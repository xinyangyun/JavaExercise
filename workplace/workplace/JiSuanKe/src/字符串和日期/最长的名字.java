package �ַ���������;

import java.util.Scanner;

public class ������� {
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
