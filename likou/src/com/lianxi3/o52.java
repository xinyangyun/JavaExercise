package com.lianxi3;

public class o52 {
	public static void main(String[] args) {

	}

	//如果他们的长度不相等，那么第二次遍历就会出现相同的节点。
	//l1=n+t;l2=m+t;  //n和m为不同的节点，t为相同的节点
	//那么l1+m=l2+n
	//所以第二次就会有相等的节点
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

		if (headA == null || headB == null)
			return null;

		ListNode node1 = headA;
		ListNode node2 = headB;

		while (node1 != node2) {
			node1 = (node1 == null) ? headB : node1.next;
			node2 = (node2 == null) ? headA : node2.next;
		}
		return node1;
	}
}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
		next = null;
	}
}
