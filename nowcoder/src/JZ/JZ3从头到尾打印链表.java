package JZ;

import java.util.ArrayList;

public class JZ3��ͷ��β��ӡ���� {
	public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
		
		//���ַ���1.����ջ�������ȳ� 2.�Ƚ�ֵ���뵽list��Ȼ����з�ת 3.�ݹ�
		
		ArrayList<Integer> res = new ArrayList<>();
		
		ListNode cur = listNode;
		
		//�ݹ�
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
