package LC;

public class LC13���������ָ������� {

	public RandomListNode copyRandomList(RandomListNode head) {
		
		if (head == null )  return null;
		
		//��һ��ɨ�裻��ÿ���ڵ���и��ƣ��Ѹ��Ƴ������½ڵ����ԭ�ڵ�֮��
		RandomListNode node = head;
		while (node != null) {
			RandomListNode newnode = new RandomListNode(node.label);
			newnode.next = node.next;
			node.next = newnode;
			node = newnode.next;
		}
		
		//�ڶ���ɨ�裺����ԭ�ڵ��random,���½ڵ��random��ֵ
		node = head;
		while (node != null) {
			if (node.random != null ) node.next.random = node.random.next;
			node = node.next.next;
		}
		
		RandomListNode newhead = head.next;
		
		//������ɨ�裺���½ڵ��ԭ���������ֳ���
		node = head;
		while (node != null) {
			RandomListNode newnode = node.next;
			node.next = newnode.next;
			if (newnode.next != null) newnode.next = newnode.next.next;
			node = node.next;
		}
		
		return newhead;
	}

}

class RandomListNode {
	int label;
	RandomListNode next, random;

	RandomListNode(int x) {
		this.label = x;
	}
};
