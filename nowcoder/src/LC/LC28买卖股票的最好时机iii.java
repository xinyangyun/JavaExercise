package LC;

import javax.swing.text.html.HTMLDocument.HTMLReader.ParagraphAction;

public class LC28������Ʊ�����ʱ��iii {
	
	
	public int maxProfit (int[] prices) {
		//����������������Ҫ׬�Ķ࣬���ǻ����٣����Ķ�
		if (prices.length == 0) {
			return 0;
		}
		int buy1 = Integer.MIN_VALUE;
		int sell1 = 0;
		int buy2 = Integer.MIN_VALUE;
		int sell2 = 0;
		for (int i = 0;i < prices.length;i++) {//����ÿ�β�����׬Ǯ���
			buy1 = Math.max(-prices[i], buy1);//��һ�������Ϊ��Ǯ������׬��-prices[i]Ԫ
			//Ҫѡ����Ǯ���ٵ�������
			sell1 = Math.max(sell1, buy1+prices[i]);//��һ������׬��Ǯ
			buy2 = Math.max(buy2, sell1- prices[i]);//�ڶ��������׬��Ǯ��Ϊ��һ��׬��-�ڶ����򻨵�
			sell2 = Math.max(sell2, buy2+prices[i]);//ͬ�ڶ�����
		}
		return sell2;
    }

}
