package JZ;

public class JZ17�����ӽṹ {

	public static void main(String[] args) {

	}

	public boolean HasSubtree(TreeNode root1, TreeNode root2) {
		if (root1 == null || root2 == null)
			return false;
		return doesTree1HasTree2(root1, root2) || HasSubtree(root1.left, root2)
				|| HasSubtree(root1.right, root2);
	}

	public boolean doesTree1HasTree2(TreeNode root1, TreeNode root2) {
		if (root2 == null)
			return true; // ˵���ҵ�������
		if (root1 == null)
			return false; // ˵��û���ҵ�
		return root1.val == root2.val && doesTree1HasTree2(root1.left, root2.left)
				&& doesTree1HasTree2(root1.right, root2.right);
	}

}
