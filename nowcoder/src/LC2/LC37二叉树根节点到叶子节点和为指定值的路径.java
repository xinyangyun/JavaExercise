package LC2;

import java.util.ArrayList;

public class LC37二叉树根节点到叶子节点和为指定值的路径 {

	ArrayList<ArrayList<Integer>> res = new ArrayList<>();
	public ArrayList<ArrayList<Integer>> pathSum(TreeNode root, int sum) {
		ArrayList<Integer> list = new ArrayList<>();
		paths(root, sum, list);
		return res;
	}
	private void paths(TreeNode root, int sum, ArrayList<Integer> list) {
		if (root == null) {
			return;
		}
		if (root.left == null && root.right == null && sum - root.val == 0) { // 等于sum并且是最后节点
			list.add(root.val);
			res.add(new ArrayList<Integer>(list));
			list.remove(list.size() - 1);
			return;
		}
		list.add(root.val);
		paths(root.left, sum - root.val, list);
		paths(root.right, sum - root.val, list);
		list.remove(list.size() - 1);
	}

}

//class TreeNode {
//	int val = 0;
//	TreeNode left = null;
//	TreeNode right = null;
//	
//	public TreeNode(int val2) {
//		this.val = val;
//	}
//
//}
