package com.lianxi3;

public class o55 {
	public static void main(String[] args) {

	}

	public boolean isBalanced(TreeNode root) {

		return recur(root) != -1;
	}

	static int recur(TreeNode root) {
		if (root == null)
			return 0;
		int left = recur(root.left);
		if (left == -1)
			return -1;
		int right = recur(root.right);
		if (right == -1)
			return -1;
		return Math.abs(left - right) < 2 ? Math.max(left, right) + 1 : -1;
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
