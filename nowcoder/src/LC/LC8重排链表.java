package LC;

import java.awt.List;

public class LC8�������� {

	public void reorderList(ListNode head) {

		// 1.��������м�Ͽ����ֳ�������
		// 2.��ת�ڶ�������
		// 3.���ڶ�������һ�β��뵽��һ������

		if (head == null || head.next == null || head.next.next == null) {
			return;
		}

		// ����ָ�룬�ҵ��м�ڵ�
		ListNode fast = head;
		ListNode slow = head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}

		ListNode mid = slow;
		ListNode start = head;
		ListNode end = mid.next;
		mid.next = null;// ����

		// ��תend���������һ���ڵ�
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
		// ����
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
