package ¶þ²æÊ÷;

public class lc110Æ½ºâ¶þ²æÊ÷ {
	public static void main(String[] args) {

	}

	public boolean isBalanced(TreeNode root) {

		return dfs(root) >= 0;
	}

	public int dfs(TreeNode root) {

		if (root == null)
			return 0;

		int l = dfs(root.left);
		int r = dfs(root.right);

		if (l >= 0 && r >= 0 && Math.abs(l - r) < 2) {
			return Math.max(l, r) + 1;
		} else {
			return -1;
		}

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
