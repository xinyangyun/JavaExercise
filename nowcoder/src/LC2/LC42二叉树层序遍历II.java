package LC2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LC42二叉树层序遍历II {

	public ArrayList<ArrayList<Integer>> levelOrderBottom(TreeNode root) {
		//每次将list保存到结果list的 0 下标的位置
		Queue<TreeNode> queue = new LinkedList<>();
		ArrayList<ArrayList<Integer>> wrapList = new ArrayList<ArrayList<Integer>>();
		if (root == null) return wrapList;
		queue.offer(root);
		while (!queue.isEmpty()) {
			int levelNum = queue.size();
			ArrayList<Integer> subList = new ArrayList<>();
			for (int i = 0;i < levelNum; i++) {
				if (queue.peek().left != null ) queue.offer(queue.peek().left);
				if (queue.peek().right != null) queue.offer(queue.peek().right); 
				subList.add(queue.poll().val);
			}
			//每次将结果保存到下标为0的位置
			wrapList.add(0,subList);
		}
		return wrapList;
	}

}
