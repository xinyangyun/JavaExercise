package LC2;

public class LC49判断二叉树是否相等 {

	
	//递归实现
	public boolean isSameTree (TreeNode p, TreeNode q) {
		if (p == null && q == null) {
			return true;
		}
		if (p == null || q == null) {
			return false;
		}
		if (p.val == q.val) {
			return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
		}
		return false;
    }
	
}
