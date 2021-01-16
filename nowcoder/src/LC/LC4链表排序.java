package LC;

public class LC4�������� {

	public ListNode sortList(ListNode head) {
		// write code here
		
		//�鲢�ķ�������������
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
		
		ListNode listA = head;//�൱��ǰ�벿��
		ListNode listB = slow;//�൱�ں�벿��
		preSlow.next = null;
		
		listA = sortList(listA); //����
		listB = sortList(listB); //����
		
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
