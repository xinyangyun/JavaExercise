package xunlian2;

import java.util.Deque;
import java.util.LinkedList;

public class o9������ջʵ�ֶ��� {
	
	Deque<Integer> stack1;
	Deque<Integer> stack2;
	
	public static void main(String[] args) {
		o9������ջʵ�ֶ��� obj = new o9������ջʵ�ֶ���();
		
		obj.appendTail(0);
		int param_2 = obj.deleteHead();
		
	}

//	ά������ջ stack1 �� stack2������ stack1 ֧�ֲ��������stack2 ֧��ɾ������
	public o9������ջʵ�ֶ���() {
		stack1 = new LinkedList<Integer>();
		stack2 = new LinkedList<Integer>();
		
    }
	
	public void appendTail(int value) {
		stack1.push(value);
	}

	public int deleteHead() {
		//�����2��ջΪ��
		if(stack2.isEmpty()) {
			while(!stack1.isEmpty()) {
				stack2.push(stack1.pop());
			}
		}
		if(stack2.isEmpty()) {
			return -1;
		}else {
			Integer deleteItem = stack2.pop();
			return deleteItem;
		}
	}
}
