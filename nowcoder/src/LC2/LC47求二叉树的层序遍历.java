package LC2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LC47求二叉树的层序遍历 {

	
	public ArrayList<ArrayList<Integer>> levelOrder (TreeNode root) {
		ArrayList<ArrayList<Integer>> res = new ArrayList<>();
		if (root == null) return res;
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		while (!queue.isEmpty()) {
			ArrayList<Integer> level = new ArrayList<>();
			
			int size = queue.size();
			for (int i = 0;i < size;i++) {
				TreeNode t = queue.poll();
				if (t.left != null) queue.add(t.left);
				if (t.right != null) queue.add(t.right);
				level.add(t.val);
			}
			res.add(level);
		}
		return res;
    }
	
}
