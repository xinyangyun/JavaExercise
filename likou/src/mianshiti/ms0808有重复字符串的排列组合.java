package mianshiti;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.jws.Oneway;

public class ms0808���ظ��ַ������������ {
	public static void main(String[] args) {

	}

	private List<String> res = new ArrayList<>(); //��̬����洢���н��
	StringBuilder path = new StringBuilder();  //����ÿ�����е��ַ���
	
	//�����㷨
	public String[] permutation(String S) {
		
		char[] c = S.toCharArray();
		Arrays.sort(c);  //������ظ�Ԫ�ص��������⣬���Ĳ���������
		
		int len = c.length;
		boolean[] used = new boolean[len];   //�����ظ�����
		backtracking(c, used);  
		String[] ans = new String[res.size()];
		for (int i = 0;i < res.size();i++) {
			ans[i] = res.get(i);
		}
		
		return ans;
	}
	
	public void backtracking(char[] c,boolean[] used) {      //�����㷨
		if (path.length() == c.length) {                  //�ݹ鷵������
			res.add(path.toString());
			return;
		}
		for (int i = 0;i < c.length;i++) {
			if (used[i]) {
				continue;
			}
			if (i > 0 && c[i] == c[i-1] && !used[i-1]) { //��֦���ų��ظ�Ԫ�ش������ظ����б��� q(1)q(2)e,q(2)q(1)e����
				continue;
			}
			path.append(c[i]);
			used[i] = true;
			backtracking(c, used);
			used[i]= false;             //����״̬
			path.deleteCharAt(path.length()-1);
 		}
	}
}
