package JZ;

public class JZ14�����е�����k���ڵ� {

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

		// ����ָ�룬���ÿ�ָ������K���ڵ㣬Ȼ�����һ���ܿ�Ϊnull��ʱ����ָ����ǵ�����k���ڵ���
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
