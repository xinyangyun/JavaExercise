package LC;

import java.util.Stack;

public class LC2��׺���ʽ {

	public int evalRPN(String[] tokens) {

		// ��ջ�����������Ƿ��žͼ���ջ������Ƿ��žͳ�����ջ����Ԫ��
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
