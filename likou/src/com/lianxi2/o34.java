package com.lianxi2;

import java.util.LinkedList;
import java.util.List;

public class o34 {
	
	LinkedList<List<Integer>> res = new LinkedList<>();
	
	LinkedList<Integer> path = new LinkedList<>();
	
	public static void main(String[] args) {
		
	}
	
	public List<List<Integer>> pathSum(TreeNode root, int sum) {
		
		recur(root, sum);
		return res;
    }
	
	//����һ��·��path�ʹ洢·����res����tarΪ0��ʱ�������Ϊsum��Ȼ����ӽ�res
	//���ҪremoveLast()���һ��������Ҫɾ��
	void recur (TreeNode root,int tar) {
		if (root == null) return;
		
		path.add(root.val);
		
		tar -= root.val;
		
		if (tar == 0 && root.left == null && root.right == null) {
			res.add(new LinkedList(path));
		}
		
		recur(root.left, tar);
		recur(root.right, tar);
		
		path.removeLast(); //�����������Ҫɾ����ʼ��ӽ�����
	}
	
}
