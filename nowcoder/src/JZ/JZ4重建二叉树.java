package JZ;

import java.util.Arrays;

public class JZ4�ؽ������� {
	public static void main(String[] args) {

	}

	public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
		
		//���鳤��Ϊ0��ʱ��Ҫ����
		if (pre.length == 0) {
			return null;
		}
		
		int rootVal = pre[0];
		
		//���鳤��Ϊ1��ʱ����
		if (pre.length == 1) {
			return new TreeNode(rootVal);
		}
		
		//�������ҵ�root���ڵ�λ�ã�ȷ����ǰ��������� �����������������еķ�Χ
		TreeNode root = new TreeNode(rootVal);
		int rootIndex = 0;
		for (int i= 0;i < in.length;i++) {
			if (rootVal == in[i]) {
				rootIndex = i;
				break;
			}
		}
		
		//�ݹ飬����root�������������Ѿ������ã���ôֻҪ��������������root���Ҽ���
		root.left = reConstructBinaryTree(Arrays.copyOfRange(pre,1, rootIndex+1), Arrays.copyOfRange(in, 0, rootIndex));
		root.right = reConstructBinaryTree(Arrays.copyOfRange(pre, rootIndex+1, pre.length), Arrays.copyOfRange(in, rootIndex+1, in.length));
		
		return root;
	}
}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}
