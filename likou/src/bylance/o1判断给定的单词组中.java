package bylance;

import java.util.ArrayList;
import java.util.List;

public class o1�жϸ����ĵ������� {
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
				if (wordDict.contains(s.substring(j, i)) && dp[j]) { //dp[j] ��ʾǰ���Ҳ����x-j ,j-i
					dp[i] = true;
					break;
				}
			}
		}
		
		return dp[s.length()];
	}
}
