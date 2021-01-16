package JZ;

public class JZ55�����л�����ڽڵ� {
	
	
	public ListNode EntryNodeOfLoop(ListNode pHead)
    {
		ListNode fast = pHead;
		ListNode low = pHead;
		 
		while (fast!=null && fast.next!=null) {
			fast = fast.next.next;
			low  = low.next;
			if (fast == low ) {
				break;
			}
		}
		
		if (fast == null || fast.next == null) { //û�л���ʱ��
			return null;
		}
		
		fast = pHead; //fast��Ϊ��ʼ�ڵ�
		while (fast!=low) {
			fast= fast.next;
			low = low.next;
		}
		
		return low;
    }
	
}
