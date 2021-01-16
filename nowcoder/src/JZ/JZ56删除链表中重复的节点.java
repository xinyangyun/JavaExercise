package JZ;

public class JZ56删除链表中重复的节点 {

	public ListNode deleteDuplication(ListNode pHead) {

//		//还有一种方法，判断当前节点是否等于当前节点的next的值
//		
//		if (pHead == null || pHead.next == null) {
//			return pHead;
//		}
//		
//		pHead.next = deleteDuplication(pHead.next);
//		
//		if (pHead.val == pHead.next.val) { //如果pHead和phead.next相等那么说明重复了，就返回phead.next
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
				//找到最后一个相同的节点
				while(last.next!=null && last.val == last.next.val) { //相当于删除了重复的节点
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
