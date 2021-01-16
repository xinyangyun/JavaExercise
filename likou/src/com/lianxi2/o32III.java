package com.lianxi2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class o32III {
	public static void main(String[] args) {
		
	}
	
	public List<List<Integer>> levelOrder(TreeNode root) {
		
		List<List<Integer>> res = new ArrayList<>();
		
		Queue<TreeNode> queue = new LinkedList<>();
		
		if (root!=null) queue.add(root);
		
		while (!queue.isEmpty()) {
			LinkedList<Integer> tmp = new LinkedList<>();
			for (int i = queue.size(); i > 0; i--) {
				TreeNode node = queue.poll();
				if (res.size() % 2== 0) tmp.addLast(node.val);  //偶数层，插入队列的首部
				else tmp.addFirst(node.val);  //奇数层，插入尾部，
				if (node.left!=null) queue.add(node.left);
				if (node.right!=null) queue.add(node.right);
			}
			res.add(tmp);
		}
		return res;
    }
}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}
