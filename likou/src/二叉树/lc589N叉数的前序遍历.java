package 二叉树;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class lc589N叉数的前序遍历 {

	ArrayList<Integer> res = new ArrayList<>();

	public static void main(String[] args) {

	}

	// 递归方法
	public List<Integer> preorder(Node root) {

		if (root == null)
			return res;

		res.add(root.val);

		for (Node child : root.children) {
			preorder(child);
		}

		return res;
	}

	public List<Integer> preorder2(Node root) {

		ArrayList<Integer> res = new ArrayList<>();
		Stack<Node> stack = new Stack<>();

		if (root == null) {
			return res;
		}

		stack.push(root);

		while (!stack.isEmpty()) {
			Node node = stack.pop();
			res.add(node.val);
			for (int i = node.children.size() - 1; i >= 0; i--) {
				stack.add(node.children.get(i));
			}
		}

		return res;
	}

}

class Node {
	public int val;
	public List<Node> children;

	public Node() {
	}

	public Node(int _val) {
		val = _val;
	}

	public Node(int _val, List<Node> _children) {
		val = _val;
		children = _children;
	}
};
