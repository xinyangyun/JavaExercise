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
				if (res.size() % 2== 0) tmp.addLast(node.val);  //ż���㣬������е��ײ�
				else tmp.addFirst(node.val);  //�����㣬����β����
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
