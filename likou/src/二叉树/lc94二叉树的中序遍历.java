package 二叉树;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class lc94二叉树的中序遍历 {
	public static void main(String[] args) {
		
	}
	
	public List<Integer> inorderTraversal(TreeNode root) {
		
		ArrayList<Integer> res = new ArrayList<>();
		Stack<TreeNode> stack = new Stack<>();
		
		while (root!=null || !stack.isEmpty()) {
			while (root !=null) {
				stack.push(root);
				root = root.left;
			}
			root = stack.pop();
			res.add(root.val);
			root = root.right;
		}
		
		return res;
    }
}
