package LC;

import java.util.ArrayList;

public class LC20分割回文串 {

	// 回溯写法
	public ArrayList<ArrayList<String>> partition(String s) {

		ArrayList<ArrayList<String>> list = new ArrayList<>();
		dfs(s, 0, new ArrayList<String>(), list);
		return list;
	}

	public void dfs(String s, int start, ArrayList<String> path, ArrayList<ArrayList<String>> list) {
		if (start == s.length()) { // 如果到最后加入list
			list.add(new ArrayList<>(path));
			return;
		}
		for (int i = start; i < s.length(); i++) {
			String s1 = s.substring(start, i + 1);
			if (!isPalindrome(s1)) {
				continue; // 如果不是跳出继续
			}
			path.add(s1); // 如果是添加入path
			dfs(s, i + 1, path, list); // 继续从i+1开始
			path.remove(path.size() - 1);// 最后清除
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
