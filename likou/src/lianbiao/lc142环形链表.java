package lianbiao;

public class lc142环形链表 {
	public static void main(String[] args) {

	}

	public ListNode detectCycle(ListNode head) {

		ListNode fast = head;
		ListNode slow = head;

		//设链表共有 a+ba+b 个节点，其中 链表头部到链表入口 有 aa 个节点（不计链表入口节点）， 链表环 有 bb 个节点
		//设两指针分别走了 f，s 步
		//fast 走的步数是slow步数的 2 倍，即 f = 2s
		//fast 比 slow多走了 n 个环的长度，即 f = s + nb
		//以上两式相减得：f = 2nb，s = nb 即fast和slow 指针分别走了 2n ,n 个 环的周长 
		//所以找到了相遇点过后，head 和slow再相遇就是第一次相遇的点了
		
		while (true) {
			if (fast==null||fast.next==null) return null;
			fast = fast.next.next;
			slow = slow.next;
			if (fast == slow ) {
				break;
			}
		}

		fast = head;
		while (slow != fast) {
			slow = slow.next;
			fast = fast.next;
		}

		return fast;
	}
}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
		next = null;
	}
}
