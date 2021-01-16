package com.lianxi1;
/*
输入两个递增排序的链表，合并这两个链表并使新链表中的节点仍然是递增排序的。

输入：1->2->4, 1->3->4
输出：1->1->2->3->4->4*/

public class o25 {
	public static void main(String[] args) {
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(4);
		ListNode node4 = new ListNode(1);
		ListNode node5 = new ListNode(3);
		ListNode node6 = new ListNode(4);
		ListNode mergeTwoLists = mergeTwoLists(node1, node2);
//		while (mergeTwoLists.next!=null) {
//			System.out.println(mergeTwoLists);
//		}
		System.out.println(mergeTwoLists.next.val);
	}

	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode listNode = new ListNode(0);
		ListNode head = listNode;
		while (l1 != null && l2 != null) {
			if (l1.val <= l2.val) {
				head.next = l1;
				head = head.next;
				l1 = l1.next;
			} else {
				head.next = l2;
				head = head.next;
				l2 = l2.next;
			}
		}

		
		if (l1 != null) {
			head.next = l1;
		}

		if (l2 != null) {
			head.next = l2;
		}

		return listNode.next;
	}
}
