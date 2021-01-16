package LC;

public class LC26еп╤о╩ьнд╢╝ {

	public boolean isPalindrome(String s) {
		s = s.toUpperCase();
		int i = 0, j = s.length() - 1;
		while (i < j) {
			while ((i < j) && !isNum(s.charAt(i)))
				i++;
			while ((i < j) && !isNum(s.charAt(j)))
				j--;
			if (i < j && s.charAt(i) == s.charAt(j)) {
				i++;
				j--;
			} else {
				return false;
			}
		}
		return false;
	}

	public boolean isNum(char c) {
		return Character.isDigit(c) || Character.isLetter(c);
	}

}
