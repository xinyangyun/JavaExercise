package com.lianxi5;

public class o68ii������������������� {
	public static void main(String[] args) {

	}

	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		if (root == null ) return null;//�����Ϊ�� ��ֱ�ӷ���null
		if (root == p || root == q) return root; //���p��q���е���root�ģ���ô���ǵ�����������ȼ�Ϊroot
		TreeNode left = lowestCommonAncestor(root.left, p, q); //�ݹ������������ֻҪ�����������ҵ���p��q�������ҵ�˭�ͷ���˭
		TreeNode right = lowestCommonAncestor(root.right, p, q);// �ݹ������������ֻҪ�����������ҵ���p��q�������ҵ�˭�ͷ���˭
		
		if (left == null) return right; // ������������� p�� q���Ҳ������� p�� qһ�������������У����������ȱ��������Ǹ���������������ȣ�һ���ڵ�Ҳ���������Լ������ȣ�
		else if (right == null) return left;// ������� left��Ϊ�գ��������������ҵ��ڵ㣨p��q������ʱ��Ҫ���ж�һ���������е������������������У�p��q���Ҳ������� p��qһ�������������У����������ȱ��������Ǹ���������������ȣ�һ���ڵ�Ҳ���������Լ������ȣ�
		else return root;
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
