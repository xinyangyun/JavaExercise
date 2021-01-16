package LC2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LC42�������������II {

	public ArrayList<ArrayList<Integer>> levelOrderBottom(TreeNode root) {
		//ÿ�ν�list���浽���list�� 0 �±��λ��
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
			//ÿ�ν�������浽�±�Ϊ0��λ��
			wrapList.add(0,subList);
		}
		return wrapList;
	}

}
