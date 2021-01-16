package LC;

public class LC27�����������·���� {

	private int maxsum;
	public int maxPathSum (TreeNode root) {
		//������������ Ϊ����
		//���ֵ�Ǽ�¼�ͣ�����Ϊ��ֵ
		//��maxsum�ķ���ֵһ��Ϊ�������⸺��
		if (root == null) {
			return 0;
		}
		maxsum = Integer.MIN_VALUE;
		maxSum(root);
		return maxsum;
    }
	public int maxSum(TreeNode root) {
		if (root == null) {
			return 0;
		}
		int left = maxSum(root.left);
		int right = maxSum(root.right);
		int sum = root.val;
		if (left > 0) {
			sum+=left;
		}
		if (right > 0) {
			sum+=right;
		}
		if (sum > maxsum) {
			maxsum = sum;
		}
		return Math.max(left, right) > 0 ? Math.max(left, right) + root.val : root.val;
	}
	
}
