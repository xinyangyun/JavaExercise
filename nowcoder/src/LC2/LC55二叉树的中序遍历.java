package LC2;

import java.util.ArrayList;
import java.util.Stack;

public class LC55二叉树的中序遍历 {

	public ArrayList<Integer> inorderTraversal (TreeNode root) {
		//非递归实现二叉树的中序遍历
		Stack<TreeNode> stack = new Stack<>();
		ArrayList<Integer> res = new ArrayList<>();
		TreeNode node = root;
		while (!stack.isEmpty() || node != null) {
			while (node != null) {  //先进栈
				stack.push(node);
				node = node.left;
			}
			node = stack.pop(); //出栈就是左子树和根节点
			res.add(node.val); 
			node = node.right; //右节点
		}
		return res;
    }
	
}
