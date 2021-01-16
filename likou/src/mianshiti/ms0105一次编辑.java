package mianshiti;

public class ms0105一次编辑 {
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
				if (len == 1) {  //second要不要添加一个字符
					j--; 
				}else if (len == -1) {  //second要不要删除一个字符
					i--;
				}
				count--;
			}
			if (count < 0) {  //最多被编辑一次
				return false;
			}
		}
		
		return true;
    }
}
