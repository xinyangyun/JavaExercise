package LC;

public class LC买卖股票的最好时机II {

	public int maxProfit(int[] prices) {
		// 判断相邻是否递增，因为连续递增 可以 合起来 看为 一次买 入卖出的操作，所以统计所有递增量即可
		if (prices == null || prices.length < 2) {
			return 0;
		}
		int res = 0;
		for (int i = 1; i < prices.length; i++) {
			if (prices[i] > prices[i - 1]) {
				res += prices[i] - prices[i - 1];
			}
		}
		return res;
	}

}
