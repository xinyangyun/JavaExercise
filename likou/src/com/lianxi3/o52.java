package com.lianxi3;

public class o52 {
	public static void main(String[] args) {

	}

	//������ǵĳ��Ȳ���ȣ���ô�ڶ��α����ͻ������ͬ�Ľڵ㡣
	//l1=n+t;l2=m+t;  //n��mΪ��ͬ�Ľڵ㣬tΪ��ͬ�Ľڵ�
	//��ôl1+m=l2+n
	//���Եڶ��ξͻ�����ȵĽڵ�
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
