package mianshiti;

public class ms0105һ�α༭ {
	public static void main(String[] args) {
		
	}
	
	public boolean oneEditAway(String first, String second) {
		
		int len = first.length() - second.length();
		
		if (len > 1 || len < -1) {
			return false;
		}
		
		int count = 1;
		
		for (int i = 0,j = 0;i <first.length() &&  j < second.length();i++,j++) {
			if (first.charAt(i) != second.charAt(j)) {  
				if (len == 1) {  //secondҪ��Ҫ���һ���ַ�
					j--; 
				}else if (len == -1) {  //secondҪ��Ҫɾ��һ���ַ�
					i--;
				}
				count--;
			}
			if (count < 0) {  //��౻�༭һ��
				return false;
			}
		}
		
		return true;
    }
}
