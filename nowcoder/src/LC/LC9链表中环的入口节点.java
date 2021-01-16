package LC;

public class LC9�����л�����ڽڵ� {

	public ListNode detectCycle(ListNode head) {

		if (head == null) {
			return null;
		}

		ListNode meetNode = meetingNode(head);

		if (meetNode == null) {
			return null;
		}

		ListNode fast = head;
		ListNode slow = meetNode;
		
		while (slow != fast) {
			slow = slow.next;
			fast = fast.next;
		}
		
		return slow;
	}

	// Ѱ�������ڵ㣬����޻�������null
	public ListNode meetingNode(ListNode head) {

		ListNode slow = head;
		ListNode fast = head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				return slow;
			}
		}
		return null;
	}

}
