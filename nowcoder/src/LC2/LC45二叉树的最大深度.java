package LC2;

import java.util.LinkedList;
import java.util.Queue;

public class LC45�������������� {

	public int maxDepth(TreeNode root) {
		//ʹ��queue���в������
		if (root == null) {
			return 0;
		}
		Queue<TreeNode> queue = new LinkedList<>();
		int res = 0;
		queue.add(root);
		while (!queue.isEmpty()) {
			int size = queue.size();
			for (int i = 0;i < size;i++) {
				TreeNode node = queue.poll();
				if (node.left != null) {
					queue.add(node.left);
				}
				if (node.right != null) {
					queue.add(node.right);
				}
			}
			res++;
		}
		return res;
	}

}
