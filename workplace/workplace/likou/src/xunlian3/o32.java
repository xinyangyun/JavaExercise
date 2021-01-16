package xunlian3;

import java.util.ArrayList;
import java.util.LinkedList;

public class o32 {
	public static void main(String[] args) {
		
	}
	
	public int[] levelOrder(TreeNode root) {
		if (root == null) return new int[0];
		
		LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
		
		ArrayList<Integer> list = new ArrayList<>();
		
		queue.add(root);
		
		while (!queue.isEmpty()) {
			TreeNode node = queue.poll();
			list.add(node.val);
			if (node.left!=null) queue.add(node.left);
			if (node.right!=null) queue.add(node.right);
		}
		return list.stream().mapToInt(Integer::intValue).toArray();
    }
	
	
}
