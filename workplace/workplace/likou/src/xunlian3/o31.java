package xunlian3;

import java.util.Iterator;
import java.util.Stack;

public class o31 {
	public static void main(String[] args) {
		int[] push = {1,2,3,4,5};
		int[] pop = {5,4,3,2,1};
		validateStackSequences(push,pop);
	}
	
	public static boolean validateStackSequences(int[] pushed, int[] popped) {
		
		Stack<Integer> stack = new Stack<>();  //����ջ
		int i = 0;  //����������
		for (int num : pushed) {
			stack.push(num);  //��ջ
//			System.out.println(111);
			while (!stack.isEmpty() && stack.peek() == popped[i] ) {  //�븨��ջ��Ƚ�
//				System.out.println(222);
				stack.pop();
				i++;
			}
		}
		return stack.isEmpty();
    }
}

