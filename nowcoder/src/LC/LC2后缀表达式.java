package LC;

import java.util.Stack;

public class LC2后缀表达式 {

	public int evalRPN(String[] tokens) {

		// 用栈解决，如果不是符号就加入栈，如果是符号就出两个栈顶的元素
		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < tokens.length; i++) {

			if (tokens[i].equals("+")) {
				int op1 = stack.pop();
				int op2 = stack.pop();
				stack.push(op1 + op2);
				continue;
			}

			if (tokens[i].equals("-")) {
				int op1 = stack.pop();
				int op2 = stack.pop();
				stack.push(op2 - op1);
				continue;
			}

			if (tokens[i].equals("*")) {
				int op1 = stack.pop();
				int op2 = stack.pop();
				stack.push(op1 * op2);
				continue;
			}

			if (tokens[i].equals("/")) {
				int op1 = stack.pop();
				int op2 = stack.pop();
				if (op1 == 0) {
					stack.push(0);
				} else {
					stack.push(op1 / op2);
				}
				continue;
			}

			stack.push(Integer.parseInt(tokens[i]));
		}

		return stack.peek();
	}

}
