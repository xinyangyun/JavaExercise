package com.lianxi3;

public class o68 {
	public static void main(String[] args) {
		
	}
	
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		while(root!=null) {
			if (root.val < p.val && root.val < q.val) { //q��p����root����������
				root = root.right;//���������ӽڵ�
			}
			else if (root.val > p.val && root.val >q.val) {//q��p����root����������
				root = root.left;//���������ӽڵ�
			}
			
			else break;
		}
		return root;
	}
}
