package JZ;

public class JZ26������������˫������ {
	
	TreeNode realHead,head;

	public TreeNode Convert(TreeNode pRootOfTree) {
		
		
		dfs(pRootOfTree);
		
		return realHead;
	}
	
	//��Ҫ�������������Ȼ������һ��cur��pre�ڵ㣬��pre��right����cur��cur��left����pre
	//���head��left����pre��pre��right����head
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
