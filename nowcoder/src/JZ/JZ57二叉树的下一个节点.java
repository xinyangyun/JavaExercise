package JZ;

public class JZ57二叉树的下一个节点 {

	public TreeLinkNode GetNext(TreeLinkNode pNode) {
		
		if (pNode == null) return null;
		
		if (pNode.right!=null) {
			pNode = pNode.right; //如果有右子树，则找到右子树的最左节点
			while (pNode.left != null) pNode = pNode.left;
			return pNode;
		}
		
		while (pNode.next !=null) { //没有右子树，则找到第一个当前节点是父亲节点左孩子的节点
			if (pNode.next.left == pNode) return pNode.next;
			pNode = pNode.next;
		}
		
		return null;  //退到跟节点任没有找到返回null
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