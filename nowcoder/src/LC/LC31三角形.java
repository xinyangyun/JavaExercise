package LC;

import java.util.ArrayList;

public class LC31三角形 {

	// 从后往上
	public int minimumTotal(ArrayList<ArrayList<Integer>> triangle) {
		if (triangle == null || triangle.size() == 0) {
			return 0;
		}
		int[] dp = new int[triangle.size()];
		ArrayList<Integer> last = triangle.get(triangle.size() - 1);
		// 最后一层复制给dp数组
		for (int i = 0; i < last.size(); i++) {
			dp[i] = last.get(i);
		}
		// 最后第二层开始
		for (int i = triangle.size() - 2; i >= 0; i--) {
			ArrayList<Integer> curList = triangle.get(i);
			// 每个节点跟下一层两个节点进行比较
			for (int j = 0; j < curList.size(); j++) {
				dp[j] = Math.min(curList.get(j) + dp[j], curList.get(j) + dp[j + 1]);
			}
		}
		return dp[0];
	}

}
