package string;

public class lc459重复的字符串 {
	public static void main(String[] args) {
		System.out.println(repeatedSubstringPattern("ababab"));  
	}
	
	public static boolean repeatedSubstringPattern(String s) {
		
		int n = s.length();
		
		//枚举的方法，
		for (int i = 1; i * 2 <= n; i++) {
			if (n % i == 0) {  //用于判断是否是倍数，是才执行
				boolean match = true;
				for (int j = i; j < n; j++) {  //枚举判断是否相等  
					if (s.charAt(j) != s.charAt(j-i)) {
						match = false;
						break;
					}
				}
				if (match) {
					return true;
				}
			}
		}
		
		return false;
    }
	
}
