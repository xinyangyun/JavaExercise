package nowcoder;

public class nc78链表反转 {
	public static void main(String[] args) {

	}

	//迭代法
	public ListNode ReverseList(ListNode head) {
		
		ListNode pre = null;
		ListNode cur = head;
		ListNode next = null;
		
		while (cur!=null) {
			//1和4的步骤就相当于往后迭代1，2，3，4
			next = cur.next;
			cur.next = pre;  //这里的pre就是前一个值， 例如2->1,现在就变成了2，1
			
			pre = cur;  //要返回的链表
			cur = next;   
			
		}
		
		return pre;
	}
}

class ListNode {
	int val;
	ListNode next = null;

	ListNode(int val) {
		this.val = val;
	}
}
