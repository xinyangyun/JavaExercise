package mianshi;

public class �����ǰ׺ {
	public static void main(String[] args) {
		
	}
	
	//	���ַ������鳤��Ϊ 0 ʱ�򹫹�ǰ׺Ϊ�գ�ֱ�ӷ���
	//	�������ǰ׺ ans ��ֵΪ��һ���ַ��������г�ʼ��
	//	����������ַ��������ν����� ans ���бȽϣ������ҳ�����ǰ׺�����ս����Ϊ�����ǰ׺
	//	������ҹ����г����� ans Ϊ�յ�������򹫹�ǰ׺������ֱ�ӷ���
	//	ʱ�临�Ӷȣ�O(s)O(s)��s Ϊ�����ַ����ĳ���֮��
	public String longestCommonPrefix(String[] strs) {
		if (strs.length == 0) {
			return "";
		}
		String ans = strs[0];
		for (int i = 1; i < strs.length; i++) {
			int j = 0;
			for (; j < ans.length() && j < strs[i].length(); j++) {
				if (ans.charAt(j) != strs[i].charAt(j)) {
					break;
				}
			}
			ans = ans.substring(0,j);
			if (ans.equals("")) {
				return ans;
			}
		}
		return ans;
    }
}
