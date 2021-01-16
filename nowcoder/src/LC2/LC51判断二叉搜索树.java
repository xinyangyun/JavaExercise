package LC2;

import java.awt.List;
import java.util.ArrayList;

public class LC51�ж϶��������� {

	public boolean isValidBST(TreeNode root) {
		ArrayList<TreeNode> list = new ArrayList<>();
		inorder(root, list);
		for (int i = 1; i < list.size(); i++) {
			if (list.get(i).val <= list.get(i - 1).val)
				return false; // �жϺ�һ���Ƿ����ǰһ��
		}
		return true;
	}

	// �����������
	public static void inorder(TreeNode root, ArrayList<TreeNode> list) {
		if (root != null) {
			inorder(root.left, list);
			list.add(root);
			inorder(root.right, list);
		}
	}

}
