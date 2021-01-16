package JZ;

public class JZ18¶þ²æÊ÷µÄ¾µÏñ {

	public static void main(String[] args) {

	}

	public void Mirror(TreeNode root) {

		if (root == null) {
			return;
		}
		
		if (root.left == null || root.right == null) {
			return;
		}
		
		TreeNode tmpNode = root.left;
		root.left = root.right;
		root.right = tmpNode;
		
		if (root.left != null) {
			Mirror(root.left);
		}
		
		if (root.right != null) {
			Mirror(root.right);
		} 
		
	}

}
