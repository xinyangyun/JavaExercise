package JZ;

import java.util.ArrayList;
import java.util.LinkedList;

public class JZ22从上往下打印二叉树 {

	public static void main(String[] args) {

	}

	public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {

		ArrayList<Integer> list = new ArrayList<>();

		if (root == null) {
			return list;
		}

		LinkedList<TreeNode> queue = new LinkedList<>();

		queue.offer(root);

		while (!queue.isEmpty()) {
			TreeNode treeNode = queue.poll();
			if (treeNode.left != null) {
				queue.offer(treeNode.left);
			}
			if (treeNode.right != null) {
				queue.offer(treeNode.right);
			}
			list.add(treeNode.val);
		}

		return list;
	}

}
