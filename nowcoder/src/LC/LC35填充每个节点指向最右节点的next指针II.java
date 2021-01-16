package LC;

import java.util.LinkedList;
import java.util.Queue;

public class LC35���ÿ���ڵ�ָ�����ҽڵ��nextָ��II {
	
	
	public void connect(TreeLinkNode root) {
		
		//��α�������¼ÿһ��Ľڵ������ѭ������nextָ��
		if (root == null) return;
		Queue<TreeLinkNode> queue = new LinkedList<>();
		
		queue.add(root);
		int curCount = 1;
		int nextCount = 0;
		
		while (!queue.isEmpty()) {
			TreeLinkNode[] arr = new TreeLinkNode[curCount];  //���һ��ڵ�
			
			for (int i = 0;i < curCount;i++) {
				TreeLinkNode curNode = queue.poll();
				arr[i] = curNode;
				if (curNode.left != null) {
					queue.add(curNode.left);
					nextCount++;
				}
				if (curNode.right != null ) {
					queue.add(curNode.right);
					nextCount++;
				}
			}
			for (int i = 0;i < arr.length - 1;i++) {
				arr[i].next = arr[i+1];
			}
			curCount = nextCount;
			nextCount = 0;
		}
		
	}
	
	
}
