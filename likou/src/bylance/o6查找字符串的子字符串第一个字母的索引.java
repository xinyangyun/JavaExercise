package bylance;

public class o6�����ַ��������ַ�����һ����ĸ������ {
	public static void main(String[] args) {
		String s = "I come from china, You come from India";
		String t = "from";
		int r_begin = strIndex(s.toCharArray(), t.toCharArray());
		System.out.println(r_begin);
	}

	public static int strIndex(char[] s, char[] t) {
		int begin = -1; // ���t��s�е���ʼλ��
		for (int index = 0; index < s.length; index++) {
			int i = index; // �ַ���s��index ����ʼ���ַ���t�Ƚ�
			int j = 0;
			while ((i < s.length && j < t.length) && (s[i++] == t[j++])) {  //�൱�ڱȽ�ֵi ��j ͬʱ++
			}
			if (j == t.length) { // ˵���ַ���t���������ַ���s��
				begin = index; // ��¼���ַ���t������s�е���ʼλ�ã����򷵻�λ��
				break;
			}
		}
		return begin;
	}
}
