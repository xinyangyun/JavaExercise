package com.lianxi3;

public class o68 {
	public static void main(String[] args) {
		
	}
	
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		while(root!=null) {
			if (root.val < p.val && root.val < q.val) { //q和p都在root的右子树中
				root = root.right;//遍历至右子节点
			}
			else if (root.val > p.val && root.val >q.val) {//q和p都在root的左子树中
				root = root.left;//遍历至左子节点
			}
			
			else break;
		}
		return root;
	}
}
