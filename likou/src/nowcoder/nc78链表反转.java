package nowcoder;

public class nc78����ת {
	public static void main(String[] args) {

	}

	//������
	public ListNode ReverseList(ListNode head) {
		
		ListNode pre = null;
		ListNode cur = head;
		ListNode next = null;
		
		while (cur!=null) {
			//1��4�Ĳ�����൱���������1��2��3��4
			next = cur.next;
			cur.next = pre;  //�����pre����ǰһ��ֵ�� ����2->1,���ھͱ����2��1
			
			pre = cur;  //Ҫ���ص�����
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
