package JZ;

public class JZ36��������ĵ�һ�������ڵ� {
	public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
		
		//����������������
		//l1 = n +t,l2 = m + t
		//�õ�l1 + m = l2 + n

		if (pHead1 == null || pHead2 == null) {
			return null;
		}
		
		ListNode node1 = pHead1;
		ListNode node2 = pHead2;
		
		while (node1!=node2) {
			node1 = (node1 == null ) ? pHead2 : node1.next;
			node2 = (node2 == null ) ? pHead1 : node2.next;
		}
		
		return node1;
	}
}
