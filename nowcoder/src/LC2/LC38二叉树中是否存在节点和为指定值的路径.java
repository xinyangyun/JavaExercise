package LC2;

public class LC38���������Ƿ���ڽڵ��Ϊָ��ֵ��·�� {

	
	//�ݹ����
	public boolean hasPathSum(TreeNode root, int sum) {
		if (root == null ) 
			return false;
		
		sum -= root.val;
		if (sum == 0 && root.left == null && root.right == null) {
			return true;
		}
		return hasPathSum(root.left, sum) || hasPathSum(root.right, sum);
	}

}
