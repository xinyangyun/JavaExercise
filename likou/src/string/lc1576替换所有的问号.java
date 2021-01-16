package string;

public class lc1576替换所有的问号 {
	public static void main(String[] args) {
		System.out.println(modifyString("?a?ub???w?b"));
	}
	
	public static String modifyString(String s) {
		
		int n = s.length();
		char[] sb = s.toCharArray();
		for (int i = 0; i < n; i++) {
			if (s.charAt(i) == '?') {
				char a = 'a';
				while ((i > 0 && sb[i-1] == a) || (i < n-1 && sb[i+1] == a)) {
					a++;
				}
				sb[i] = a;
			}
 		}
		return String.valueOf(sb);
    }
	
}
