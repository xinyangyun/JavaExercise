package LC;

import java.util.ArrayList;

public class LC20�ָ���Ĵ� {

	// ����д��
	public ArrayList<ArrayList<String>> partition(String s) {

		ArrayList<ArrayList<String>> list = new ArrayList<>();
		dfs(s, 0, new ArrayList<String>(), list);
		return list;
	}

	public void dfs(String s, int start, ArrayList<String> path, ArrayList<ArrayList<String>> list) {
		if (start == s.length()) { // �����������list
			list.add(new ArrayList<>(path));
			return;
		}
		for (int i = start; i < s.length(); i++) {
			String s1 = s.substring(start, i + 1);
			if (!isPalindrome(s1)) {
				continue; // ���������������
			}
			path.add(s1); // ����������path
			dfs(s, i + 1, path, list); // ������i+1��ʼ
			path.remove(path.size() - 1);// ������
		}
	}

	public boolean isPalindrome(String s) {
		int begin = 0;
		int end = s.length() - 1;
		while (begin < end) {
			if (s.charAt(begin++) != s.charAt(end--)) {
				return false;
			}
		}
		return true;
	}

}
