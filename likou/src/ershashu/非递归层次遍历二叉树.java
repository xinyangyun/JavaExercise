package ershashu;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class 非递归层次遍历二叉树 {
	public static void main(String[] args) {
	}
	
	public List<Integer> levelTraversal(TreeNode root) {
		ArrayList<Integer> res = new ArrayList<>();
		if (root == null) {
			return res;
		}
		LinkedList<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		while (queue.isEmpty()) {
			TreeNode cur = queue.remove();
			res.add(cur.val);
			if (cur.left!=null) queue.add(cur.left);
			if (cur.right!=null) queue.add(cur.right);
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

