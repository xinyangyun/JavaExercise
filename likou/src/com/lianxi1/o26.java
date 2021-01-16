package com.lianxi1;

/*输入两棵二叉树A和B，判断B是不是A的子结构。(约定空树不是任意一个树的子结构)

B是A的子结构， 即 A中有出现和B相同的结构和节点值。

例如:
给定的树 A:

     3
    / \
   4   5
  / \
 1   2
给定的树 B：

   4 
  /
 1
返回 true，因为 B 与 A 的一个子树拥有相同的结构和节点值。*/

/*输入：A = [1,2,3], B = [3,1]
输出：false
*/

public class o26 {
	public static void main(String[] args) {
		TreeNode A = new TreeNode(3);
		TreeNode A2 = new TreeNode(4);
		TreeNode A3 = new TreeNode(5);
		TreeNode A4 = new TreeNode(1);
		TreeNode A5 = new TreeNode(2);
		A.left = A2;
		A.right = A3;
		A2.left = A4;
		A2.right = A5;
		
		TreeNode B = new TreeNode(4);
		TreeNode B1 = new TreeNode(1);
		B.left = B1;
		
		System.out.println(isSubStructure(A, B));
		
	}

	public static boolean isSubStructure(TreeNode A, TreeNode B) {
		
		if(A == null || B == null) return false;
		return dfs(A,B) || isSubStructure(A.left, B) || isSubStructure(A.right, B);
	}

	public static boolean dfs(TreeNode A,TreeNode B) {
		if (B ==null) return true;
		if(A == null) return false;
		return A.val == B.val && dfs(A.left,B.left) && dfs(A.right, B.right);
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
