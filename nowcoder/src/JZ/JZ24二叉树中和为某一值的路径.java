package JZ;

import java.util.ArrayList;

public class JZ24二叉树中和为某一值的路径 {
	
	ArrayList<ArrayList<Integer>> res = new ArrayList<>();
	
	ArrayList<Integer> path = new ArrayList<>();

	public 	ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
		
		recur(root, target);
		
		return res;
	}
	
	//定义一个路径path和存储路径的res，当tar为0的时候满足和为sum，然后添加进res
	//最后要remove最后一个不满足的。
	void recur(TreeNode root,int tar) {
		
		if (root == null) return;
		
		path.add(root.val);
		
		tar -= root.val;
		
		if (tar == 0 && root.left == null && root.right == null) {
			res.add(new ArrayList<>(path));
		}
		
		recur(root.left, tar);
		recur(root.right, tar);
		
		path.remove(path.size()-1); //不满足的删除掉
	}

}
