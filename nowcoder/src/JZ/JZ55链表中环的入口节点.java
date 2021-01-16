package JZ;

public class JZ55链表中环的入口节点 {
	
	
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
		
		if (fast == null || fast.next == null) { //没有环的时候
			return null;
		}
		
		fast = pHead; //fast变为开始节点
		while (fast!=low) {
			fast= fast.next;
			low = low.next;
		}
		
		return low;
    }
	
}
