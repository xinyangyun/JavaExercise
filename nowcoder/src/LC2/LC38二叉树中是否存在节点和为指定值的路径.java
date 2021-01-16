package LC2;

public class LC38二叉树中是否存在节点和为指定值的路径 {

	
	//递归求解
	public boolean hasPathSum(TreeNode root, int sum) {
		if (root == null ) 
			return false;
		
		sum -= root.val;
		if (sum == 0 && root.left == null && root.right == null) {
			return true;
		}
		return hasPathSum(root.left, sum) || hasPathSum(root.right, sum);
	}

}
