package JZ;

public class JZ57����������һ���ڵ� {

	public TreeLinkNode GetNext(TreeLinkNode pNode) {
		
		if (pNode == null) return null;
		
		if (pNode.right!=null) {
			pNode = pNode.right; //����������������ҵ�������������ڵ�
			while (pNode.left != null) pNode = pNode.left;
			return pNode;
		}
		
		while (pNode.next !=null) { //û�������������ҵ���һ����ǰ�ڵ��Ǹ��׽ڵ����ӵĽڵ�
			if (pNode.next.left == pNode) return pNode.next;
			pNode = pNode.next;
		}
		
		return null;  //�˵����ڵ���û���ҵ�����null
	}

}

class TreeLinkNode {
	int val;
	TreeLinkNode left = null;
	TreeLinkNode right = null;
	TreeLinkNode next = null;

	TreeLinkNode(int val) {
		this.val = val;
	}
}