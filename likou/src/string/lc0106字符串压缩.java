package string;

public class lc0106×Ö·û´®Ñ¹Ëõ {
	public static void main(String[] args) {
		System.out.println(compressString("bbbfff"));
	}
	
	public static String compressString(String S) {
		int idx = 0;
		int len = S.length();
		StringBuilder sb = new StringBuilder();
		
		while (idx != len) {
			char c = S.charAt(idx);
			
			int count = 1;
			
			while (idx + 1 < len && c == S.charAt(idx+1)) {
				idx++;
				count++;
			}
			
			idx++;
			sb.append(c);
			sb.append(count);
		}
		
		String press = sb.toString();
		return press.length() < len ? press : S;
    }
}
