package LC2;

public class LC40有序链表变成二叉搜索树 {

	public TreeNode sortedListToBST(ListNode head) {
		return toBST(head, null);
	}

	private TreeNode toBST(ListNode head,ListNode tail) {
		
		if (head == tail) {
			return null;
		}
		//申请两个指针，fast移动速度是low的两倍
		ListNode fast = head;
		ListNode slow = head;
		while (fast != tail && fast.next!= tail) {  //快慢指针二分成前半部分和后半部分
			fast = fast.next.next;
			slow = slow.next;
		}
		TreeNode root = new TreeNode(slow.val);
		root.left = toBST(head, slow);  //前半部分
		root.right = toBST(slow.next, tail);  //后半部分
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
