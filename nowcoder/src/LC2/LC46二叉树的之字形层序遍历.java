package LC2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LC46二叉树的之字形层序遍历 {

	public ArrayList<ArrayList<Integer>> zigzagLevelOrder (TreeNode root) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<>();
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		if (root == null ) return result;
		q.add(root);
		int cnt = 0;
		while (!q.isEmpty()) {
			ArrayList<Integer> temp = new ArrayList<>();
			int size = q.size();
			for (int i = 0;i < size;i++) {
				TreeNode t = q.poll();
				if (t.left != null) q.add(t.left);
				if (t.right != null) q.add(t.right);
				if (cnt%2 == 0) temp.add(t.val);  
				else temp.add(0,t.val);//如果是奇数层倒着存放
			}
			result.add(temp);
			cnt++;
		}
		return result;
    }
	
}
