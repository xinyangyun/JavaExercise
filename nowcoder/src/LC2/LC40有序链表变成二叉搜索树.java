package LC2;

public class LC40���������ɶ��������� {

	public TreeNode sortedListToBST(ListNode head) {
		return toBST(head, null);
	}

	private TreeNode toBST(ListNode head,ListNode tail) {
		
		if (head == tail) {
			return null;
		}
		//��������ָ�룬fast�ƶ��ٶ���low������
		ListNode fast = head;
		ListNode slow = head;
		while (fast != tail && fast.next!= tail) {  //����ָ����ֳ�ǰ�벿�ֺͺ�벿��
			fast = fast.next.next;
			slow = slow.next;
		}
		TreeNode root = new TreeNode(slow.val);
		root.left = toBST(head, slow);  //ǰ�벿��
		root.right = toBST(slow.next, tail);  //��벿��
		return root;
	}
	
}

class ListNode {
	int val;
	ListNode next = null;
	
	public ListNode(int val) {
		this.val = val;
	}
}
