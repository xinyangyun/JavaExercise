package xunlian3;

import java.util.HashMap;

public class o35 {
	public static void main(String[] args) {

	}

	public Node copyRandomList(Node head) {
		
		HashMap<Node,Node> map = new HashMap<>();
		
		Node cur = head;
		//复制节点值
		while (cur!=null) {
			map.put(cur, new Node(cur.val));  //复制节点但是next和random都为空
			cur = cur.next;
		}
		
		//复制节点指向
		cur = head;
		
		while (cur!=null) {
			map.get(cur).next = map.get(cur.next);//新节点的next指向旧节点的next，next和random都是node
			map.get(cur).random = map.get(cur.random);//新节点的random指向旧节点的random
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
