package mianshi;

import java.util.HashSet;

public class �ж������Ƿ��л� {
	public static void main(String[] args) {

	}

	//��һ�ַ���ʹ��HashSet����
	static boolean hasCycle(ListNode head) {
		// �������϶���
		HashSet<ListNode> set = new HashSet<ListNode>();
		//��������
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
	
	//�ڶ��֣�����ָ���������
	//��������ָ��fast��slow�����߳�ʼָ������ͷ��slowÿ��ǰ��һ�Σ�fastÿ��ǰ������
	//�����ָ�������ָ�룬��֤����������Ǵ����ĵ�������
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
