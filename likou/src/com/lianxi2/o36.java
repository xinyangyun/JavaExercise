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
	
	// 打印中序遍历
//	void dfs(TreeNode root) {
//	    if(root == null) return;
//	    dfs(root.left); // 左
//	    System.out.println(root.val); // 根
//	    dfs(root.right); // 右
//	}
	//主要利用中序遍历，然后设置一个cur和pre节点，使pre的right等于cur，cur的left等于pre
	//最后head的left等于pre，pre的right等于head
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
