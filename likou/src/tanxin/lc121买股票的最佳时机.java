package tanxin;

public class lc121���Ʊ�����ʱ�� {
	public static void main(String[] args) {
		
	}
	
	public int maxProfit(int[] prices) {
		
		if (prices.length <= 1) {
			return 0;
		}
		
		int min = prices[0],max = 0;
		
		for (int i = 1; i < prices.length; i++) {
			max = Math.max(max, prices[i]-min);  //���Ʊ���
			min = Math.min(min, prices[i]); //����������С
		}
		
		return max;
    }
	
}
