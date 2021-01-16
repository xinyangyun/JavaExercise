package LC2;

public class LC57������ָ�����䷴ת {

	public ListNode reverseBetween(ListNode head, int m, int n) {
		ListNode dummy = new ListNode(0);
		dummy.next = head;
		ListNode preStart = dummy;
		ListNode start = head;
		for (int i = 1; i < m; i++) { // �ҵ���ʼλ��
			preStart = start;
			start = start.next;
		}
		// ��ת
		for (int i = 0; i < n - m; i++) {
			ListNode temp = start.next;
			start.next = temp.next;
			temp.next = preStart.next;
			preStart.next = temp;
		}
		return dummy.next;
	}

}
