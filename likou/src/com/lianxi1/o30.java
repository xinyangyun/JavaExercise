package com.lianxi1;

/*定义栈的数据结构，请在该类型中实现一个能够得到栈的最小元素的 min 函数在该栈中，
调用 min、push 及 pop 的时间复杂度都是 O(1)。*/

/*MinStack minStack = new MinStack();
minStack.push(-2);
minStack.push(0);
minStack.push(-3);
minStack.min();   --> 返回 -3.
minStack.pop();
minStack.top();      --> 返回 0.
minStack.min();   --> 返回 -2.
*/
public class o30 {
	private static Node head;
	
	public static void main(String[] args) {
		o30.push(-2);
		o30.push(0);
		o30.push(-3);
		    
		System.out.println(o30.min());
		o30.pop();
		o30.top();  
	}
	
	public o30() {

    }
    
    public static void push(int x) {
    	if (head == null) {
    		head = new Node(x, x, null);
    	}else {
    		head = new Node(x,Math.min(x, head.val),head);
    	}
    }
    
    public static void pop() {
    	head = head.next;
    }
    
    public static int top() {
		return head.val;
    }
    
    public static int min() {
		return head.min;
    }
    
    private static class Node{
    	int val;
    	int min;
    	Node next;
    	
    	public Node(int val,int min,Node next) {
    		this.val = val;
    		this.min = min;
    		this.next = next;
    	}
    }
}
