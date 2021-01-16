package com.lianxi2;

public class o36 {
	
	Node pre,head;
	
	public static void main(String[] args) {

	}

	public Node treeToDoublyList(Node root) {
		
		if (root == null) return null;
		
		dfs(root);  
		
		head.left = pre;
		
		pre.right = head;
		
		return head;
	}
	
	// ��ӡ�������
//	void dfs(TreeNode root) {
//	    if(root == null) return;
//	    dfs(root.left); // ��
//	    System.out.println(root.val); // ��
//	    dfs(root.right); // ��
//	}
	//��Ҫ�������������Ȼ������һ��cur��pre�ڵ㣬ʹpre��right����cur��cur��left����pre
	//���head��left����pre��pre��right����head
	void dfs (Node cur) {
		if (cur == null) return;
		
		dfs(cur.left);
		
		if (pre!=null) pre.right = cur;
		else head = cur;
		cur.left = pre;
		pre = cur;
		
		dfs(cur.right);	
		
	}
	
}

class Node {
	public int val;
	public Node left;
	public Node right;

	public Node() {
	}

	public Node(int _val) {
		val = _val;
	}

	public Node(int _val, Node _left, Node _right) {
		val = _val;
		left = _left;
		right = _right;
	}
};
