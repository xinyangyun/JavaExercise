package LC2;

public class LC44从前序和中序遍历构造二叉树 {

	public TreeNode buildTree(int[] preorder, int[] inorder) {
		return buildTree(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
	}
	private TreeNode buildTree(int[] preorder, int preLeft, int preRight, int[] inorder, int inLeft, int inRight) {
		if (preRight < preLeft) {
			return null;
		}
		TreeNode node = new TreeNode(preorder[preLeft]);
		if (preRight == preLeft) {
			return node;
		}
		int num = 0;
		for (int i = inLeft; i <= inRight; i++) {
			if (inorder[i] == preorder[preLeft]) {
				num = i;
				break;
			}
		}
		int length = num - inLeft;
		node.left = buildTree(preorder, preLeft + 1, preLeft + length, inorder, inLeft, inLeft + length - 1);
		node.right = buildTree(preorder, preLeft + length + 1, preRight, inorder, num + 1, inRight);
		return node;
	}

}
