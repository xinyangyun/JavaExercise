package LC;

import java.util.Set;

public class LC12拆分语句 {

	public boolean wordBreak(String s, Set<String> dict) {
		
		//动态规划
		//其基本原理是将一个字符串分成两个部分，如果两个部分都满足要求，则总的字符串是满足要求的，这两个部分又可以继续去判断
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
