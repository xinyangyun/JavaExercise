package LC;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class LC11拆分语句II {

	// 动态规划思想，用map把已经求得的结果存起来，避免重复劳动
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
