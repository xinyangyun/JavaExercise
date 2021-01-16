package LC;

import java.awt.List;

public class LC8重排链表 {

	public void reorderList(ListNode head) {

		// 1.将链表从中间断开，分成两部分
		// 2.反转第二个链表
		// 3.将第二个链表一次插入到第一个链表

		if (head == null || head.next == null || head.next.next == null) {
			return;
		}

		// 快慢指针，找到中间节点
		ListNode fast = head;
		ListNode slow = head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}

		ListNode mid = slow;
		ListNode start = head;
		ListNode end = mid.next;
		mid.next = null;// 断链

		// 翻转end链表，处理第一个节点
		ListNode pre = end;
		ListNode cur = pre.next;

		while (cur != null) {
			if (pre == end) {
				pre.next = null;
			}
			ListNode next = cur.next;
			cur.next = pre;
			pre = cur;
			cur = next;
		}
		end = pre;
		// 插入
		while (start != null && end != null) {
			ListNode next1 = start.next;
			ListNode next2 = end.next;
			start.next = end;
			end.next = next1;
			start = next1;
			end = next2;
		}

		return;

	}

}
