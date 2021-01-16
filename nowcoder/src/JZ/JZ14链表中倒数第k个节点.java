package JZ;

public class JZ14链表中倒数第k个节点 {

	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(3);
		l1.next = l2;
		l2.next = l3;

		ListNode res = FindKthToTail(l1, 4);

		System.out.println(res.val);
	}

	public static ListNode FindKthToTail(ListNode head, int k) {

		if (head == null || k < 0) {
			return null;
		}

		// 快慢指针，先让快指针先跑K个节点，然后快慢一起跑快为null的时候，慢指针就是倒数第k个节点了
		ListNode fast = head, slow = head;

		//Leecode
//		while (fast != null && k > 0) {
//			fast = fast.next;
//			k--;
//		}
//		
//		while (fast != null) {
//			fast = fast.next;
//			slow = slow.next;
//		}

		//nowcoder
		for (int i = 1; i < k; i++) {
			if (fast.next == null) {
				return null;
			}
			fast = fast.next;
		}

		while (fast.next != null) {
			fast = fast.next;
			slow = slow.next;
		}

		return slow;
	}

}
