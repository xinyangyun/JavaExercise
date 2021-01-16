package LC2;

public class LC43������ͺ��������������� {

	/*
	 * ˼·�������������ڵ���ҽڵ�����ڵ㣩���һ���ڵ�Ϊ���ڵ㣬��˿���ֱ��ȷ������postorder[]���һ��Ԫ���Ǹ��ڵ㣬
	 * Ȼ��ͨ��Ѱ�������������ڵ�����ڵ���ҽڵ㣩�еĸ��ڵ㼴��ȷ���������������ڵ�ǰ�������������������ڵ������������������ ��Ȼ�����õݹ鼴�ɵý�
	 */
	public TreeNode buildTree(int[] inorder, int[] postorder) {
		if (inorder == null || postorder == null || inorder.length == 0 || postorder.length == 0) {
			return null;
		}
		int in = inorder.length - 1;
		int post = postorder.length  - 1;
		return solve(inorder, 0, in, postorder, 0, post);
	}

	// x,y�ֱ�������������ʼ������λ�ã�i,j�ֱ������������ʼ������λ��
	public TreeNode solve(int[] inorder, int x, int y, int[] postorder, int i, int j) {
		if (x > y || i > j) {
			return null;
		}
		TreeNode root=new TreeNode(postorder[j]);
		for (int k = x;k <= y;k++) {
			if (inorder[k] == postorder[j]) {
				//k-x������������и��ڵ������������
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