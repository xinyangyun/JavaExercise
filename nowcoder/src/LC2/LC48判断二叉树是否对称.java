package LC2;

public class LC48ÅÐ¶Ï¶þ²æÊ÷ÊÇ·ñ¶Ô³Æ {

	public boolean isSymmetric(TreeNode root) {  
		return check(root, root);
	}

	public static boolean check(TreeNode x,TreeNode y) {
		if (x == null && y == null) return true;
		if ((x == null && y != null) || (x != null && y == null)) return false; 
		return x.val == y.val && check(x.left, y.right) && check(x.right, y.left);
	}
	
}
