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
		
		Queue<TreeNode> queue = new LinkedList<>();  //��Žڵ��ֵת��res�С�
		
		queue.add(root);
		
		while (!queue.isEmpty()) {
			TreeNode node =  queue.poll();//����
			
			if (node!=null) {
				res.append(node.val+",");//����res
				queue.add(node.left);//�������
				queue.add(node.right);//�������
			}
			else res.append("null,");//nodeΪ�����null
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
			TreeNode node = queue.poll();  //�ڵ����
			if (!vals[i].equals("null")) {   //������null�����ڵ�
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
