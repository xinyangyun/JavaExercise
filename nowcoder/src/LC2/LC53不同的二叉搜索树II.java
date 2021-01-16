package LC2;

import java.util.ArrayList;

public class LC53��ͬ�Ķ���������II {

	public ArrayList<TreeNode> generateTrees(int n) {
		return creteTree(1, n);
	}

	
	public ArrayList<TreeNode> creteTree(int low,int high) {
		ArrayList<TreeNode> result = new ArrayList<>();
		if (low > high) {
			result.add(null);
			return result;
		}
		for (int i = low;i <= high;i++) {
			//����ڵ�i��������������
			ArrayList<TreeNode> left = creteTree(low, i-1);
			ArrayList<TreeNode> right = creteTree(i+1, high);
			for (int j = 0;j < left.size();j++) {
				for (int k = 0;k < right.size();k++) {
					//�����������໥��ԣ�ÿһ����������������������ƥ�䣬ÿһ���������������е�������ƥ��
					TreeNode newNode = new TreeNode(i);
					newNode.left = left.get(j);
					newNode.right = right.get(k);
					result.add(newNode);
				}
			}
		}
		return result;
	}
	
}
