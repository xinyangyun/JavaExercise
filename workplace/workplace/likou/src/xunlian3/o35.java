package xunlian3;

import java.util.HashMap;

public class o35 {
	public static void main(String[] args) {

	}

	public Node copyRandomList(Node head) {
		
		HashMap<Node,Node> map = new HashMap<>();
		
		Node cur = head;
		//���ƽڵ�ֵ
		while (cur!=null) {
			map.put(cur, new Node(cur.val));  //���ƽڵ㵫��next��random��Ϊ��
			cur = cur.next;
		}
		
		//���ƽڵ�ָ��
		cur = head;
		
		while (cur!=null) {
			map.get(cur).next = map.get(cur.next);//�½ڵ��nextָ��ɽڵ��next��next��random����node
			map.get(cur).random = map.get(cur.random);//�½ڵ��randomָ��ɽڵ��random
			cur = cur.next;
		}
		
		return map.get(head);
	}
}

class Node {
	int val;
	Node next;
	Node random;

	public Node(int val) {
		this.val = val;
		this.next = null;
		this.random = null;
	}
}