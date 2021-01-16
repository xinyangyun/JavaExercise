package LC2;

public class LC50恢复二叉搜索树 {

	
		//firstElem第一个被交换的element，secondElem被交换的element
		TreeNode firstElem = null,secondElem = null;
		//把上一个节点初始化为最小值
		TreeNode preElem = new TreeNode(Integer.MIN_VALUE);
		
		public void recoverTree(TreeNode root) {
			//中序遍历
			inOrderTraverse(root);
			
			int temp = firstElem.val;
			firstElem.val = secondElem.val;
			secondElem.val = temp;
		}
	
		private void inOrderTraverse(TreeNode root) {
			if (root == null ) return;
			inOrderTraverse(root.left);
			
			//1234567到1264537
			if (firstElem == null && preElem.val >= root.val) {
				firstElem = preElem;
			}
			
			if (firstElem != null && preElem.val >= root.val) {
				secondElem = root;
			}
			
			preElem = root;
			inOrderTraverse(root.right);
		}
	
}
