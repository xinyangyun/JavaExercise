package mianshi;

import java.util.HashSet;

public class 判断链表是否有环 {
	public static void main(String[] args) {

	}

	//第一种方法使用HashSet方法
	static boolean hasCycle(ListNode head) {
		// 创建集合对象
		HashSet<ListNode> set = new HashSet<ListNode>();
		//遍历链表
		ListNode p = head;
		while (p != null) {
			if (set.contains(p)) {
				return true;
			}else {
				set.add(p);
			}
			p = p.next;
		}
		return false;
	}
	
	//第二种：快慢指针遍历方法
	//定义两个指针fast和slow，两者初始指向链表头，slow每次前进一次，fast每次前进两次
	//如果快指针等于慢指针，就证明这个链表是带环的单向链表
	static boolean hasCycle2(ListNode head) {
		if (head == null || head.next == null) {
			return false;
		}
		ListNode fast = head;
		ListNode slow = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				return true;
			}
		}
		return false;
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
