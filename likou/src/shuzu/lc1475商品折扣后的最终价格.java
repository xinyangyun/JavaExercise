package shuzu;

import java.util.Stack;

public class lc1475商品折扣后的最终价格 {
	public static void main(String[] args) {
		
	}
	
	public int[] finalPrices(int[] prices) {
		
		Stack<Integer> stack = new Stack<>();
		
		int l = prices.length;
		
		for (int i = 0; i < prices.length; i++) {
			if (!stack.empty() && prices[i] <= prices[stack.peek()]) {
				while (!stack.empty() && prices[i] <= prices[stack.peek()]) {
					prices[stack.peek()] = prices[stack.peek()] - prices[i];
					stack.pop();
				}
			}
			stack.push(i);
		}
		
		return prices;
    }
}
