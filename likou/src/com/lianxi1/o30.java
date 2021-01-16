package com.lianxi1;

/*����ջ�����ݽṹ�����ڸ�������ʵ��һ���ܹ��õ�ջ����СԪ�ص� min �����ڸ�ջ�У�
���� min��push �� pop ��ʱ�临�Ӷȶ��� O(1)��*/

/*MinStack minStack = new MinStack();
minStack.push(-2);
minStack.push(0);
minStack.push(-3);
minStack.min();   --> ���� -3.
minStack.pop();
minStack.top();      --> ���� 0.
minStack.min();   --> ���� -2.
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
