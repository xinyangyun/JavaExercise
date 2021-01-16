package LC2;

public class LC63�������� {

	public ListNode partition(ListNode head, int x) {
		// ˼·�� �½������ڵ�preHead1��preHead2���ֱ�Ϊָ�����������ͷ���
		// �ѽ��ֵС��X�Ľڵ����ӵ�����1�ϣ��ڵ�ֵ����� X�Ľڵ����ӵ�����2��
		// ���2����������

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
