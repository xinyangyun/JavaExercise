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
	
	//定义一个路径path和存储路径的res，当tar为0的时候满足和为sum，然后添加进res
	//最后要removeLast()最后一个不满足要删除
	void recur (TreeNode root,int tar) {
		if (root == null) return;
		
		path.add(root.val);
		
		tar -= root.val;
		
		if (tar == 0 && root.left == null && root.right == null) {
			res.add(new LinkedList(path));
		}
		
		recur(root.left, tar);
		recur(root.right, tar);
		
		path.removeLast(); //如果不满足则要删除开始添加进来的
	}
	
}
