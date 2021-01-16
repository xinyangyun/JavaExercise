package LC2;

public class LC43从中序和后序遍历构造二叉树 {

	/*
	 * 思路：后序遍历（左节点→右节点→根节点）最后一个节点为根节点，因此可以直接确定数组postorder[]最后一个元素是根节点，
	 * 然后通过寻找中序遍历（左节点→根节点→右节点）中的根节点即可确定左右子树（根节点前面序列是左子树，根节点后面序列是右子树） ，然后利用递归即可得解
	 */
	public TreeNode buildTree(int[] inorder, int[] postorder) {
		if (inorder == null || postorder == null || inorder.length == 0 || postorder.length == 0) {
			return null;
		}
		int in = inorder.length - 1;
		int post = postorder.length  - 1;
		return solve(inorder, 0, in, postorder, 0, post);
	}

	// x,y分别代表中序遍历起始，结束位置，i,j分别代表后序遍历起始、结束位置
	public TreeNode solve(int[] inorder, int x, int y, int[] postorder, int i, int j) {
		if (x > y || i > j) {
			return null;
		}
		TreeNode root=new TreeNode(postorder[j]);
		for (int k = x;k <= y;k++) {
			if (inorder[k] == postorder[j]) {
				//k-x代表中序遍历中根节点的左子树长度
				root.left = solve(inorder, x, k-1, postorder, i, i+k-x-1);
				root.right = solve(inorder, k+1, y, postorder, i+k-x, j-1);
				break;
			}
		}
		return root;
	}

}

class TreeNode {
	int val = 0;
	TreeNode left = null;
	TreeNode right = null;
	
	public TreeNode(int val) {
		this.val = val;
	}
}