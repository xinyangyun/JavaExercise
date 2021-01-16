package JZ;

public class JZ53表示数值的字符串 {

	public boolean isNumeric(char[] str) {

		if (str.length == 0) {
			return false;
		}
		
		//标记是否遇到相同情况
		boolean numSeen = false;
		boolean dotSeen = false;
		boolean eSeen = false;
		
		for (int i = 0;i < str.length;i++) {
			if (str[i] >= '0' && str[i] <= '9') {
				numSeen = true;
			}else if (str[i] == '.') {
				//.之前不能出现.或e
				if(dotSeen||eSeen) {
					return false;
				}
				dotSeen = true;
			}else if(str[i] == 'e' || str[i] == 'E') {
				//e之前不能出现e，必须出现数
				if (eSeen || !numSeen) {
					return false;
				}
				eSeen = true;
				numSeen = false;//重置numSeen,排除123e或者123e+的情况，确保e之后也出现数
			}else if (str[i] == '-' || str[i] == '+') {
				//+-出现在0位置或则e/E的后面第一个位置才是合法的
				if (i!=0 && str[i-1] !='e' && str[i-1] != 'E') {
					return false;
				}
			}else {//其它不合法
				return false;
			}
		}
		
		return numSeen;
	}

}
