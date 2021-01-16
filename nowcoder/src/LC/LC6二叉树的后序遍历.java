package LC;

import java.util.ArrayList;
import java.util.Stack;

public class LC6二叉树的后序遍历 {
	
	
	public ArrayList<Integer> postorderTraversal (TreeNode root) {
		
		ArrayList<Integer> list = new ArrayList<>();
		
		Stack<TreeNode> stack = new Stack<>();
		
		if (root == null)  return list;
		
		stack.push(root);
		
		while (!stack.isEmpty()) {
			TreeNode node = stack.pop();
			list.add(0,node.val);  //每次插入到头部
			if (node.left != null) stack.push(node.left);
 			if (node.right!=null) stack.push(node.right);
		}
		
		return list;
    }
	
}
