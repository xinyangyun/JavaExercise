package LC;

import java.util.ArrayList;
import java.util.Stack;

public class LC7二叉树的前序遍历 {

	public ArrayList<Integer> preorderTraversal(TreeNode root) {

		//二叉树的前序遍历，直接root ， left，right就行了
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
