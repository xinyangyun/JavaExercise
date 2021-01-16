package LC2;

public class LC57链表内指定区间反转 {

	public ListNode reverseBetween(ListNode head, int m, int n) {
		ListNode dummy = new ListNode(0);
		dummy.next = head;
		ListNode preStart = dummy;
		ListNode start = head;
		for (int i = 1; i < m; i++) { // 找到起始位置
			preStart = start;
			start = start.next;
		}
		// 反转
		for (int i = 0; i < n - m; i++) {
			ListNode temp = start.next;
			start.next = temp.next;
			temp.next = preStart.next;
			preStart.next = temp;
		}
		return dummy.next;
	}

}
