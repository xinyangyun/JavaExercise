package LC;

public class LC5����Ĳ������� {
	
	
	public ListNode insertionSortList (ListNode head) {
		
		//1.�ж�һ��
		if (head == null || head.next == null) {
			return head;
		}
		
		//2.�½�һ������ڵ�
		ListNode dummy = new ListNode(0);
		
		//3.currָ��Ľڵ㼰��������нڵ㶼��δ����ģ�ǰ�涼���ź����
		ListNode curr = head;
		while (curr != null ) {
			//4.ÿ��ѭ����pre������ָ��dummy,dummy��һ���ڵ㵽currǰһ���ڵ㶼���ź����
			ListNode pre = dummy;
			//5.����һ�µ�ǰ�ڵ����һ���ڵ������
			ListNode next = curr.next;
			//6.ÿ�ζ���dummy�ڵ���һ����ʼ�ң�ǰ�涼������õģ����С�ڵ�ǰ�ڵ���ָ����ƣ�--j
			//���߱ȵ�ǰ�ڵ���ʱ��ֹͣ������pre����һ���ڵ���ǵ�ǰ�ڵ�Ӧ�÷ŵ�λ��
			while (pre.next != null && pre.next.val < curr.val) {
				pre = pre.next;
			}
			
			//7.�ҵ���ǰ�ڵ�Ӧ�÷ŵ�λ�ú�����Ĺ��������ƶ�ָ�룬��curr�嵽pre��pre.next��
			//Ȼ����curr����һλ��ǰ�涼������õ�
			curr.next = pre.next;
			pre.next = curr;
			curr = next;
		}
		//8.dummy���������������Ҫ���ò��������ź��������
		return dummy.next;
    }
	
}
