package com.lianxi2;

import java.util.LinkedList;
import java.util.Queue;

public class o37 {
	public static void main(String[] args) {

	}

	// Encodes a tree to a single string.
	public String serialize(TreeNode root) {
		
		if (root == null) return "[]";
		
		StringBuilder res = new StringBuilder("[");
		
		Queue<TreeNode> queue = new LinkedList<>();  //存放节点的值转入res中。
		
		queue.add(root);
		
		while (!queue.isEmpty()) {
			TreeNode node =  queue.poll();//出队
			
			if (node!=null) {
				res.append(node.val+",");//加入res
				queue.add(node.left);//加入队列
				queue.add(node.right);//加入队列
			}
			else res.append("null,");//node为空则加null
		}
		res.deleteCharAt(res.length()-1);
		res.append("]");
		return res.toString();
	}

	// Decodes your encoded data to tree.
	public TreeNode deserialize(String data) {
		
		if (data.equals("[]")) return null;
		
		String[] vals = data.substring(1, data.length()-1).split(",");
		
		TreeNode root = new TreeNode(Integer.parseInt(vals[0]));
		
		Queue<TreeNode> queue = new LinkedList<>();
		
		queue.add(root);
		
		int i = 1;
		
		while (!queue.isEmpty()) {
			TreeNode node = queue.poll();  //节点出队
			if (!vals[i].equals("null")) {   //不等于null添加左节点
				node.left = new TreeNode(Integer.parseInt(vals[i]));
				queue.add(node.left);
			}
			i++;
			if (!vals[i].equals("null")) {
				node.right = new TreeNode(Integer.parseInt(vals[i]));
				queue.add(node.right);
			}
			i++;
		}
		
		return root;
	}
}
