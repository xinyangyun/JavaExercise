package tanxin;

public class lc121买股票的最佳时机 {
	public static void main(String[] args) {
		
	}
	
	public int maxProfit(int[] prices) {
		
		if (prices.length <= 1) {
			return 0;
		}
		
		int min = prices[0],max = 0;
		
		for (int i = 1; i < prices.length; i++) {
			max = Math.max(max, prices[i]-min);  //求股票最大
			min = Math.min(min, prices[i]); //求数组中最小
		}
		
		return max;
    }
	
}
