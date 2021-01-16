package com.lianxi3;

public class o63 {
	public static void main(String[] args) {

	}

	//���prices[i] ����min,���������res
	//����˵����ǰ��prices[i]��min��С�������min
	public int maxProfit(int[] prices) {
		if (prices == null || prices.length <= 1) {
			return 0;
		}
		
		int res = 0, min = prices[0];
		
		for (int i = 1; i < prices.length; i++) {
			if (prices[i] < min) {
				min = prices[i];
			} else {
				res = Math.max(res, prices[i] - min);
			}
		}
		
		return res;
	}
}
