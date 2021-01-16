package xunlian2;

import java.util.Deque;
import java.util.LinkedList;

public class o9用两个栈实现队列 {
	
	Deque<Integer> stack1;
	Deque<Integer> stack2;
	
	public static void main(String[] args) {
		o9用两个栈实现队列 obj = new o9用两个栈实现队列();
		
		obj.appendTail(0);
		int param_2 = obj.deleteHead();
		
	}

//	维护两个栈 stack1 和 stack2，其中 stack1 支持插入操作，stack2 支持删除操作
	public o9用两个栈实现队列() {
		stack1 = new LinkedList<Integer>();
		stack2 = new LinkedList<Integer>();
		
    }
	
	public void appendTail(int value) {
		stack1.push(value);
	}

	public int deleteHead() {
		//如果第2个栈为空
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
