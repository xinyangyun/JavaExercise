package xunlian3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class o32II {
	public static void main(String[] args) {

	}

	public static List<List<Integer>> levelOrder(TreeNode root) {
			Queue<TreeNode> queue = new LinkedList<>();
			
			List<List<Integer>> res = new ArrayList<>();
			
			if (root!=null) queue.add(root);
			
			while (!queue.isEmpty()) {
				List<Integer> tmp = new ArrayList<>();
				for (int i = queue.size(); i > 0; i--) { //循环当前层的节点数
					TreeNode node = queue.poll();
					tmp.add(node.val);
					if (node.left!=null) queue.add(node.left);
					if (node.right!=null) queue.add(node.right);
				}
				res.add(tmp);
			}
			return res;	
	}
	
}
