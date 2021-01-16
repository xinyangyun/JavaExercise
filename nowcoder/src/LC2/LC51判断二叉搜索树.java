package LC2;

import java.awt.List;
import java.util.ArrayList;

public class LC51判断二叉搜索树 {

	public boolean isValidBST(TreeNode root) {
		ArrayList<TreeNode> list = new ArrayList<>();
		inorder(root, list);
		for (int i = 1; i < list.size(); i++) {
			if (list.get(i).val <= list.get(i - 1).val)
				return false; // 判断后一个是否大于前一个
		}
		return true;
	}

	// 中序遍历有序
	public static void inorder(TreeNode root, ArrayList<TreeNode> list) {
		if (root != null) {
			inorder(root.left, list);
			list.add(root);
			inorder(root.right, list);
		}
	}

}
