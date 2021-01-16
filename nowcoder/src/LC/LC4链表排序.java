package LC;

public class LC4链表排序 {

	public ListNode sortList(ListNode head) {
		// write code here
		
		//归并的方法用在链表上
		if (head == null) {
			return null;
		}
		
		if (head.next == null) {
			return head;
		}
		
		ListNode preSlow = head;
		ListNode slow = head;
		ListNode fast = head;
		while (slow != null && fast != null && fast.next != null) {
			preSlow = slow;
			slow = slow.next;
			fast = fast.next.next;
		}
		
		ListNode listA = head;//相当于前半部分
		ListNode listB = slow;//相当于后半部分
		preSlow.next = null;
		
		listA = sortList(listA); //排序
		listB = sortList(listB); //排序
		
		return merge(listA, listB);
	}
	
	public ListNode merge(ListNode listA,ListNode listB) {
		
		ListNode dummy = new ListNode(0);
		ListNode nodeA = listA;
		ListNode nodeB = listB;
		ListNode nodeR = dummy;
		
		while (nodeA != null && nodeB != null) {
			if (nodeA.val < nodeB.val) {
				nodeR.next = nodeA;
				nodeA = nodeA.next;
			}else {
				nodeR.next = nodeB;
				nodeB = nodeB.next;
			}
			nodeR = nodeR.next;
		}
		
		if (nodeA != null) {
			nodeR.next = nodeA;
		}
		
		if (nodeB != null) {
			nodeR.next = nodeB;
		}
		
		return dummy.next;
	}

}

class ListNode {
	int val;
	ListNode next = null;
	
	public ListNode(int val) {
		this.val = val;
	}
}
