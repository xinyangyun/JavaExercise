package JZ;

import java.util.ArrayList;

public class JZ3从头到尾打印链表 {
	public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
		
		//三种方法1.利用栈的先入先出 2.先将值存入到list中然后进行翻转 3.递归
		
		ArrayList<Integer> res = new ArrayList<>();
		
		ListNode cur = listNode;
		
		//递归
		if (cur != null) {
			if (cur.next != null) {
				res = printListFromTailToHead(cur.next);
			}
			res.add(cur.val);
		}
		
		return res;
	}
}

class ListNode {
	int val;
	ListNode next = null;

	ListNode(int val) {
		this.val = val;
	}
}
