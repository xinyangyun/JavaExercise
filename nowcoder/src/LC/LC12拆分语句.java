package LC;

import java.util.Set;

public class LC12������ {

	public boolean wordBreak(String s, Set<String> dict) {
		
		//��̬�滮
		//�����ԭ���ǽ�һ���ַ����ֳ��������֣�����������ֶ�����Ҫ�����ܵ��ַ���������Ҫ��ģ������������ֿ��Լ���ȥ�ж�
		int len = s.length();
		
		boolean[] flags = new boolean[len+1];
		flags[0] = true;
		
		for (int i = 1;i <= len;i++) {
			for (int j = 0;j < i;j++) {
				if (flags[j] ==true && dict.contains(s.substring(j,i))) {
					flags[i] = true;
					break;
				}
			}
		}
		
		return flags[len];
	}
	

}
