package LC;

import javax.swing.text.html.HTMLDocument.HTMLReader.ParagraphAction;

public class LC28买卖股票的最好时机iii {
	
	
	public int maxProfit (int[] prices) {
		//无论是买还是卖，都要赚的多，就是花的少，卖的多
		if (prices.length == 0) {
			return 0;
		}
		int buy1 = Integer.MIN_VALUE;
		int sell1 = 0;
		int buy2 = Integer.MIN_VALUE;
		int sell2 = 0;
		for (int i = 0;i < prices.length;i++) {//计算每次操作后赚钱最多
			buy1 = Math.max(-prices[i], buy1);//第一次买后，因为花钱，所以赚了-prices[i]元
			//要选出花钱最少的那天买
			sell1 = Math.max(sell1, buy1+prices[i]);//第一次卖后赚的钱
			buy2 = Math.max(buy2, sell1- prices[i]);//第二次买，买后赚的钱数为第一次赚的-第二次买花的
			sell2 = Math.max(sell2, buy2+prices[i]);//同第二次卖
		}
		return sell2;
    }

}
