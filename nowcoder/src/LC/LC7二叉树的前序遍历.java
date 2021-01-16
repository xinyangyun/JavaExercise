package LC;

import java.util.ArrayList;
import java.util.Stack;

public class LC7��������ǰ����� {

	public ArrayList<Integer> preorderTraversal(TreeNode root) {

		//��������ǰ�������ֱ��root �� left��right������
		ArrayList<Integer> list = new ArrayList<>();

		if (root == null) {
			return list;
		}

		Stack<TreeNode> stack = new Stack<>();
		stack.push(root);

		while (!stack.isEmpty()) {
			TreeNode temp = stack.pop();
			list.add(temp.val);
			if (temp.right != null) {
				stack.push(temp.right);
			}
			if (temp.left != null) {
				stack.push(temp.left);
			}
		}

		return list;
	}

}
