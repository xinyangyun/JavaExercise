package lianbiao;

public class lc142�������� {
	public static void main(String[] args) {

	}

	public ListNode detectCycle(ListNode head) {

		ListNode fast = head;
		ListNode slow = head;

		//�������� a+ba+b ���ڵ㣬���� ����ͷ����������� �� aa ���ڵ㣨����������ڽڵ㣩�� ���� �� bb ���ڵ�
		//����ָ��ֱ����� f��s ��
		//fast �ߵĲ�����slow������ 2 ������ f = 2s
		//fast �� slow������ n �����ĳ��ȣ��� f = s + nb
		//������ʽ����ã�f = 2nb��s = nb ��fast��slow ָ��ֱ����� 2n ,n �� �����ܳ� 
		//�����ҵ������������head ��slow���������ǵ�һ�������ĵ���
		
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
