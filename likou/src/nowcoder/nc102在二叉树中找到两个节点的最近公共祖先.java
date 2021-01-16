package nowcoder;

public class nc102�ڶ��������ҵ������ڵ������������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int lowestCommonAncestor (TreeNode root, int o1, int o2) {
		if (root == null) {
			return -1; //��
		}
		
		if (root.val == o1 || root.val == o2) {
			return root.val;
		}
		
		int left = lowestCommonAncestor(root.left, o1, o2);
		int right = lowestCommonAncestor(root.right, o1, o2);
		
		if (left == -1) return right;
		else if (right == -1) return left;
		else return root.val;
    }
	
}

class TreeNode {
	int val = 0;
	TreeNode left = null;
	TreeNode right = null;
}
