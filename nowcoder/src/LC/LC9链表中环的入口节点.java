package LC;

public class LC9链表中环的入口节点 {

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

	// 寻找相遇节点，如果无环，返回null
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
