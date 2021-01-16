package LC;

public class LC27二叉树的最大路径和 {

	private int maxsum;
	public int maxPathSum (TreeNode root) {
		//左右子树可能 为负数
		//最大值是记录和，可能为负值
		//但maxsum的返回值一定为尽量避免负数
		if (root == null) {
			return 0;
		}
		maxsum = Integer.MIN_VALUE;
		maxSum(root);
		return maxsum;
    }
	public int maxSum(TreeNode root) {
		if (root == null) {
			return 0;
		}
		int left = maxSum(root.left);
		int right = maxSum(root.right);
		int sum = root.val;
		if (left > 0) {
			sum+=left;
		}
		if (right > 0) {
			sum+=right;
		}
		if (sum > maxsum) {
			maxsum = sum;
		}
		return Math.max(left, right) > 0 ? Math.max(left, right) + root.val : root.val;
	}
	
}
