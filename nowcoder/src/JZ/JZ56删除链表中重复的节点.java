package JZ;

public class JZ56ɾ���������ظ��Ľڵ� {

	public ListNode deleteDuplication(ListNode pHead) {

//		//����һ�ַ������жϵ�ǰ�ڵ��Ƿ���ڵ�ǰ�ڵ��next��ֵ
//		
//		if (pHead == null || pHead.next == null) {
//			return pHead;
//		}
//		
//		pHead.next = deleteDuplication(pHead.next);
//		
//		if (pHead.val == pHead.next.val) { //���pHead��phead.next�����ô˵���ظ��ˣ��ͷ���phead.next
//			pHead = pHead.next.next;
//		}
//		
//		return pHead;

		if (pHead == null || pHead.next == null) {
			return pHead;
		}
		
		ListNode head = new ListNode(0);
		head.next = pHead;
		ListNode pre = head;
		ListNode last = head.next;
		
		while (last!=null) {
			if (last.next != null && last.val == last.next.val) {
				//�ҵ����һ����ͬ�Ľڵ�
				while(last.next!=null && last.val == last.next.val) { //�൱��ɾ�����ظ��Ľڵ�
					last = last.next;
				}
				pre.next = last.next;
				last = last.next;
			}else {
				pre.next = last.next;
				last = last.next;
			}
		}
		return head.next;
	}

}
