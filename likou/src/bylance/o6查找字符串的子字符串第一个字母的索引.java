package bylance;

public class o6查找字符串的子字符串第一个字母的索引 {
	public static void main(String[] args) {
		String s = "I come from china, You come from India";
		String t = "from";
		int r_begin = strIndex(s.toCharArray(), t.toCharArray());
		System.out.println(r_begin);
	}

	public static int strIndex(char[] s, char[] t) {
		int begin = -1; // 标记t在s中的起始位置
		for (int index = 0; index < s.length; index++) {
			int i = index; // 字符串s从index 处开始和字符串t比较
			int j = 0;
			while ((i < s.length && j < t.length) && (s[i++] == t[j++])) {  //相当于比较值i 和j 同时++
			}
			if (j == t.length) { // 说明字符串t出现在了字符串s中
				begin = index; // 记录下字符串t出现在s中的起始位置，程序返回位置
				break;
			}
		}
		return begin;
	}
}
