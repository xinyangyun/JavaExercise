package LC2;

import java.util.Arrays;

public class LC62搅乱字符串 {

	//	思路：递归
	//	* 简单的说，就是s1和s2是scramble的话，
	//	* 那么必然存在一个在s1上的长度l1，
	//	* 将s1分成s11和s12两段，同样有s21和s22.
	//	* 那么要么s11和s21是scramble的并且s12和s22是scramble的；
	//	* 要么s11和s22是scramble的并且s12和s21是scramble的。
	//	* 就拿题目中的例子 rgeat 和 great 来说，
	//	* rgeat 可分成 rg 和 eat 两段，
	//	* great 可分成 gr 和 eat 两段，
	//	* rg 和 gr 是scrambled的， eat 和 eat 当然是scrambled。
	public boolean isScramble(String s1, String s2) {
		if (s1.length() != s2.length()) {
			return false;
		}
		if (s1.equals(s2)) {
			return true;
		}
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		if (!Arrays.equals(c1, c2)) {
			return false;
		}
		for (int i = 1; i < s1.length(); i++) {
			if (isScramble(s1.substring(0,i), s2.substring(0,i))
					&& isScramble(s1.substring(i), s2.substring(i))) {
				return true;
			}
			if (isScramble(s1.substring(0,i), s2.substring(s2.length()-i))
					&& isScramble(s1.substring(i), s2.substring(0,s2.length()-i))) {
				return true;
			}
		}
		return false;
	}

}
