package LC;

public class LC22���������ڵ㵽Ҷ�ӽڵ������·���� {

	//���������˼��(������)+�������(ÿһ�㶼���ϲ��*10+��ǰ���ڵ��ֵ)
	public int sumNumbers(TreeNode root) {
		int sum = 0;
		if (root == null) {
			return sum;
		}
		return preorderSumNumbers(root, sum);
	}

	public int preorderSumNumbers(TreeNode root,int sum) {
		if (root == null) {
			return 0;
		}
		sum = sum * 10 + root.val;
		if (root.left == null && root.right == null) {
			return sum;
		}
		return preorderSumNumbers(root.left, sum) + preorderSumNumbers(root.right, sum);
	}
}
