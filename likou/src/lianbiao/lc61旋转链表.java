package lianbiao;

public class lc61��ת���� {
	public static void main(String[] args) {
		
	}
	
	
	//�ȱ�����������ܳ���count��ͬʱ��������β������
	//���ҵ�ԭ����ĵ�����k+1���ڵ㣬�ýڵ��next�����������ͷ��㡣
	public ListNode rotateRight(ListNode head, int k) {
		
		
		if (head == null || head.next == null || k == 0) return head;
		
		int count = 1; //����ͳ�������ܽڵ���
		
		ListNode tmp  = head;
		
		while (tmp.next != null) {
			count++;
			tmp = tmp.next;
		}
		
		k %= count;
		
		//��k����0ʱ������Ҫ��ת
		if (k== 0) return head;
		
		//�����������������ؽ�������ת �������Ƚ���β����
		tmp.next = head;
		
		//����ֻ��Ҫ�ҵ�������k+1���ڵ�
		for (int i =0;i < count - k;i++) {
			tmp = tmp.next;
		}
		
		ListNode newHead = tmp.next;
		tmp.next = null;
		
		return newHead;
    }
}
