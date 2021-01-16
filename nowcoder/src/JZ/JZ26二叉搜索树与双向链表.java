package JZ;

public class JZ26二叉搜索树与双向链表 {
	
	TreeNode realHead,head;

	public TreeNode Convert(TreeNode pRootOfTree) {
		
		
		dfs(pRootOfTree);
		
		return realHead;
	}
	
	//主要利用中序遍历，然后设置一个cur和pre节点，是pre的right等于cur，cur的left等于pre
	//最后head的left等于pre，pre的right等于head
	void dfs(TreeNode cur) {
		if (cur == null) return;
		
		dfs(cur.left);
		
		if (head == null) {
			head = cur;
			realHead = cur;
		}else {
			head.right = cur;
			cur.left = head;
			head = cur;
		}
		
		dfs(cur.right);
	}

}
