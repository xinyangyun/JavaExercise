package xunlian3;

public class o24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		ListNode node5 = new ListNode(5);
		
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		ListNode reverseList = reverseList(node1);
		System.out.println(reverseList.next.val);
	}

	public static ListNode reverseList(ListNode head) {
		ListNode newHead = null;
		ListNode node;
//		ListNode next = null;
		while (head!=null) {
			//1.对链表进行做头删
			node = head;
			head = head.next;
			
			//2.对链表做头插
			node.next = newHead;
			newHead = node;
		}
		
		return newHead;
	}

}



