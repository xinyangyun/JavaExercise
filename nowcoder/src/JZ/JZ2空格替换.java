package JZ;

public class JZ2�ո��滻 {
	
	
	public String replaceSpace(StringBuffer str) {
		
		StringBuffer ans = new StringBuffer();
		
		for (int i = 0;i < str.toString().length();i++) {
			char s = str.charAt(i);
			if (String.valueOf(s).equals(" ")) {
				ans.append("%20");
			}else {
				ans.append(s);
			}
		}
		
		return ans.toString();
	}
	
	
}
