package xunlian3;

public class o22 {
	public static void main(String[] args) {
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		ListNode node5 = new ListNode(5);
		ListNode node6 = new ListNode(6);
		
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;
		ListNode kthFromEnd = getKthFromEnd(node1, 2);
		System.out.println(kthFromEnd.val);
	}

	//双指针思路，2个指针都指向第一个节点，先前一个和后一个差k步，当后面的next为null时就是倒数第k个节点了
	public static ListNode getKthFromEnd(ListNode head, int k) {
		
		ListNode former = head;
		ListNode latter = head;
		
		for (int i = 0; i < k; i++) {
			former = former.next;
		}
		
		while (former!=null) {
			former = former.next;
			latter = latter.next;
		}
		return latter;
	}
}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}
