package ×Ö·û´®ºÍÈÕÆÚ;

import java.util.Scanner;

public class ×Ö·û´® {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char[] charArray = str.toCharArray(); 
		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] >= 'a' && charArray[i] <= 'z') {
				if (charArray[i] == 'z') {
					charArray[i] = 'a';
				}else {
					charArray[i] = (char) (charArray[i]+1);
				}
			}
			if (charArray[i] >= 'A' && charArray[i] <= 'Z') {
				if (charArray[i] == 'Z') {
					charArray[i] = 'A';
				}else {
					charArray[i] = (char) (charArray[i]+1);
				} 
			}
		}
		for (int i = 0; i < charArray.length; i++) {
			System.out.print(charArray[i]);
		}
	}
}
