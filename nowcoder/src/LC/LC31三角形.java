package LC;

import java.util.ArrayList;

public class LC31������ {

	// �Ӻ�����
	public int minimumTotal(ArrayList<ArrayList<Integer>> triangle) {
		if (triangle == null || triangle.size() == 0) {
			return 0;
		}
		int[] dp = new int[triangle.size()];
		ArrayList<Integer> last = triangle.get(triangle.size() - 1);
		// ���һ�㸴�Ƹ�dp����
		for (int i = 0; i < last.size(); i++) {
			dp[i] = last.get(i);
		}
		// ���ڶ��㿪ʼ
		for (int i = triangle.size() - 2; i >= 0; i--) {
			ArrayList<Integer> curList = triangle.get(i);
			// ÿ���ڵ����һ�������ڵ���бȽ�
			for (int j = 0; j < curList.size(); j++) {
				dp[j] = Math.min(curList.get(j) + dp[j], curList.get(j) + dp[j + 1]);
			}
		}
		return dp[0];
	}

}
