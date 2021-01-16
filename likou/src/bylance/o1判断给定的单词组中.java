package bylance;

import java.util.ArrayList;
import java.util.List;

public class o1判断给定的单词组中 {
	public static void main(String[] args) {
		String s = "leetcode";
		List<String> list = new ArrayList<>();
		list.add("leet");
		list.add("code");
		System.out.println(wordBreak(s, list));
		
	}

	public static boolean wordBreak(String s, List<String> wordDict) {
		
		boolean[] dp = new boolean[s.length()+1];
		dp[0] = true;
		
		for (int i = 0;i <= s.length() ;i++) {
			for (int j = 0; j!= i;j++) {
				if (wordDict.contains(s.substring(j, i)) && dp[j]) { //dp[j] 表示前面的也存在x-j ,j-i
					dp[i] = true;
					break;
				}
			}
		}
		
		return dp[s.length()];
	}
}
