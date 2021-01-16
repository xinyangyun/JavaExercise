package mianshiti;

public class ms0205¡¥±Ì«Û∫Õ {
	public static void main(String[] args) {

	}

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

		ListNode ans = new ListNode(0);
		ListNode cur = ans;
		int carry = 0;

		while (l1 != null || l2 != null ) {
			
			int num1 = l1 == null ? 0 : l1.val;
			int num2 = l2 == null ? 0 : l2.val;
			
			int num = num1 + num2 + carry;
			carry = num/10;
			
			cur.next = new ListNode(num%10);
			
			l1 = l1 == null ? null : l1.next;
			l2 = l2 == null ? null : l2.next;
			
			cur = cur.next;
			
 		}
		
		if (carry == 1) 
			cur.next = new ListNode(carry);

		return ans.next;
	}
}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}
