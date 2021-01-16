package LC2;

public class LC50�ָ����������� {

	
		//firstElem��һ����������element��secondElem��������element
		TreeNode firstElem = null,secondElem = null;
		//����һ���ڵ��ʼ��Ϊ��Сֵ
		TreeNode preElem = new TreeNode(Integer.MIN_VALUE);
		
		public void recoverTree(TreeNode root) {
			//�������
			inOrderTraverse(root);
			
			int temp = firstElem.val;
			firstElem.val = secondElem.val;
			secondElem.val = temp;
		}
	
		private void inOrderTraverse(TreeNode root) {
			if (root == null ) return;
			inOrderTraverse(root.left);
			
			//1234567��1264537
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
