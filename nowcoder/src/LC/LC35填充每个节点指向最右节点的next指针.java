package LC;

import java.util.LinkedList;

public class LC35���ÿ���ڵ�ָ�����ҽڵ��nextָ�� {

	public void connect(TreeLinkNode root) {

		if (root == null)
			return;

		LinkedList<TreeLinkNode> queue = new LinkedList<>();

		queue.offer(root);

		while (!queue.isEmpty()) {
			int length = queue.size();// length�洢��Ŀǰ��һ��ĳ���
			for (int i = 0; i < length; i++) {
				TreeLinkNode curNode = queue.poll();
				if (i == length - 1) { //length��ʾ����һ�����һ���ڵ㣬����nextΪnull
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
