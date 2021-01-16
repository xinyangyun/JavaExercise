package LC2;

import java.util.ArrayList;

public class LC53不同的二叉搜索树II {

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
			//求根节点i的左右子树集合
			ArrayList<TreeNode> left = creteTree(low, i-1);
			ArrayList<TreeNode> right = creteTree(i+1, high);
			for (int j = 0;j < left.size();j++) {
				for (int k = 0;k < right.size();k++) {
					//将左右子树相互配对，每一个左子树都与所有右子树匹配，每一个右子树都与所有的左子树匹配
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
