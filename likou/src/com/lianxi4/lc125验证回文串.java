package com.lianxi4;

public class lc125验证回文串 {
	public static void main(String[] args) {
		String s = "A man, a plan, a canal: Panama";
		System.out.println(isPalindrome(s));
	}

	public static boolean isPalindrome(String s) {
		
		StringBuffer sgood = new StringBuffer();
		
		int length = s.length();
		
		for (int i = 0; i < length;i++) {
			char ch = s.charAt(i);
			if (Character.isLetterOrDigit(ch)) {
				sgood.append(Character.toUpperCase(ch));
			}
		}
		
		int n = sgood.length();
		int left = 0,right = n - 1;
		while (left < right) {
			if (Character.toLowerCase(sgood.charAt(left))!=Character.toLowerCase(sgood.charAt(right))) {
				return false;
			}
			++left;
			--right;
		}
				
		
		return true;
	}
}
