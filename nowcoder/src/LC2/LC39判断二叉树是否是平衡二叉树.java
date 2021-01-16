package LC2;

public class LC39�ж϶������Ƿ���ƽ������� {

	public boolean isBalanced(TreeNode root) {
		if (root == null)
			return true;
		if (Math.abs(getHigh(root.left) - getHigh(root.right)) <= 1) {
			return isBalanced(root.left) && isBalanced(root.right);
		}
		return false;
	}

	private int getHigh(TreeNode root) {
		if (root == null)
			return 0;
		return Math.max(getHigh(root.left), getHigh(root.right)) + 1;
	}

}
