package JZ;

public class JZ58对称的二叉树 {
	
	boolean isSymmetrical(TreeNode pRoot)
    {
		if (pRoot == null ) {
			return true;
		}
		
		return helper(pRoot.left, pRoot.right);
    }
	
	public boolean helper(TreeNode root1,TreeNode root2) {
		if (root1 == null && root2 == null) { //两个为null返回true
			return true;
		}
		if (root1 == null || root2 == null) {  //一个为null返回false
			return false;
		}
		return root1.val == root2.val && helper(root1.left, root2.right) && helper(root1.right, root2.left);
	}
	
}
