package string;

public class lc459�ظ����ַ��� {
	public static void main(String[] args) {
		System.out.println(repeatedSubstringPattern("ababab"));  
	}
	
	public static boolean repeatedSubstringPattern(String s) {
		
		int n = s.length();
		
		//ö�ٵķ�����
		for (int i = 1; i * 2 <= n; i++) {
			if (n % i == 0) {  //�����ж��Ƿ��Ǳ������ǲ�ִ��
				boolean match = true;
				for (int j = i; j < n; j++) {  //ö���ж��Ƿ����  
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
