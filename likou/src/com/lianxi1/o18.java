package com.lianxi1;

import java.util.Scanner;

/*给定单向链表的头指针和一个要删除的节点的值，定义一个函数删除该节点。
返回删除后的链表的头节点。*/
/*
输入: head = [4,5,1,9], val = 5
输出: [4,1,9]
解释: 给定你链表中值为 5 的第二个节点，那么在调用了你的函数之后，该链表应变为 4 -> 1 -> 9.*/

public class o18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ListNode n1 = new ListNode(4);
		ListNode n2 = new ListNode(5);
		ListNode n3 = new ListNode(1);
		ListNode n4 = new ListNode(9);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		ListNode ss = deleteNode(n1, sc.nextInt());
		System.out.println(ss.next.val);  
	}

	public static ListNode deleteNode(ListNode head, int val) {
		if (head == null) {
			return null;
		}
		if (head.val == val) {
			return head.next;
		}
		
		ListNode cur = head;
		while(cur.next != null && cur.next.val != val) {
			cur = cur.next;
		}
		if (cur.next!=null) {
			cur.next = cur.next.next;
		}
		return head;
	}
}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}
