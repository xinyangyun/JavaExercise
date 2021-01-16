package xunlian2;

import java.util.Scanner;
import java.util.Stack;

public class o6从尾到头打印链表 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(3);
		ListNode node3 = new ListNode(2);
		
		node1.next = node2;
		node2.next = node3;
		
		int[] arr = reversePrint(node1);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}
	
	
	public static int[] reversePrint(ListNode head) {

		Stack<ListNode> stack = new Stack<>();
		
		ListNode head2 = head;
		while (head2 != null) {
			stack.push(head2);
			head2 = head2.next;
		}
		int[] temp =new int[stack.size()];
		for (int j = 0; j < temp.length; j++) {
			temp[j] = stack.pop().val;
		}
		return temp;
    }
	
}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}
