package LC;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class LC11������II {

	// ��̬�滮˼�룬��map���Ѿ���õĽ���������������ظ��Ͷ�
	public ArrayList<String> wordBreak(String s, Set<String> dict) {
		
		Long s33 = 123L;
		long s55 = 45L;

		return dfs(s, dict, new HashMap<String,ArrayList<String>>());
	}

	public ArrayList<String> dfs(String s, Set<String> wordDict, HashMap<String, ArrayList<String>> map) {

		if (map.containsKey(s)) {
			return map.get(s);
		}

		ArrayList<String> res = new ArrayList<>();

		if (s.length() == 0) {
			res.add("");
			return res;
		}

		for (String subStr : wordDict) {
			if (s.startsWith(subStr)) {
				for (String str : dfs(s.substring(subStr.length()), wordDict, map)) {
					res.add(subStr + (str == "" ? "" : " ") + str);
				}
			}
		}

		map.put(s, res);
		return res;
	}

}
