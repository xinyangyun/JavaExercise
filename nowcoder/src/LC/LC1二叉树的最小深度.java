package LC;

public class LC1二叉树的最小深度 {
	public int run(TreeNode root) {

		if (root == null) {
			return 0;
		}

		if (root.left == null && root.right == null) {
			return 1;
		}

		if (root.left == null || root.right == null) {
			return Math.max(run(root.left), run(root.right)) + 1;
		}

		return Math.min(run(root.left), run(root.right)) + 1;
	}
}

class TreeNode {
	int val = 0;
	TreeNode left = null;
	TreeNode right = null;
}
