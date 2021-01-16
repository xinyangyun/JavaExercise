package LC2;

public class LC63划分链表 {

	public ListNode partition(ListNode head, int x) {
		// 思路： 新建两个节点preHead1和preHead2，分别为指向两个链表的头结点
		// 把结点值小于X的节点链接到链表1上，节点值大等于 X的节点链接到链表2上
		// 最后2个链表相连

		ListNode preHead1 = new ListNode(0), preHead2 = new ListNode(0);
		ListNode cur1 = preHead1, cur2 = preHead2;

		while (head != null) {
			if (head.val < x) {
				cur1.next = head;
				cur1 = cur1.next;
			} else {
				cur2.next = head;
				cur2 = cur2.next;
			}
			head = head.next;
		}

		cur1.next = preHead2.next;
		cur2.next = null;
		return preHead1.next;
	}

}
