package LC;

import java.util.LinkedList;

public class LC35填充每个节点指向最右节点的next指针 {

	public void connect(TreeLinkNode root) {

		if (root == null)
			return;

		LinkedList<TreeLinkNode> queue = new LinkedList<>();

		queue.offer(root);

		while (!queue.isEmpty()) {
			int length = queue.size();// length存储的目前这一层的长度
			for (int i = 0; i < length; i++) {
				TreeLinkNode curNode = queue.poll();
				if (i == length - 1) { //length表示是这一层最后一个节点，它的next为null
					curNode.next = null;
				}else {
					curNode.next = queue.peek();
				}
				if (curNode.left != null) queue.offer(curNode.left);
				if (curNode.right != null ) queue.offer(curNode.right);
			}
		}

	}

}

class TreeLinkNode {
	int val;
	TreeLinkNode left, right, next;

	TreeLinkNode(int x) {
		val = x;
	}
}
