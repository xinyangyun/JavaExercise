package JZ;

import java.util.ArrayList;

public class JZ24�������к�Ϊĳһֵ��·�� {
	
	ArrayList<ArrayList<Integer>> res = new ArrayList<>();
	
	ArrayList<Integer> path = new ArrayList<>();

	public 	ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
		
		recur(root, target);
		
		return res;
	}
	
	//����һ��·��path�ʹ洢·����res����tarΪ0��ʱ�������Ϊsum��Ȼ����ӽ�res
	//���Ҫremove���һ��������ġ�
	void recur(TreeNode root,int tar) {
		
		if (root == null) return;
		
		path.add(root.val);
		
		tar -= root.val;
		
		if (tar == 0 && root.left == null && root.right == null) {
			res.add(new ArrayList<>(path));
		}
		
		recur(root.left, tar);
		recur(root.right, tar);
		
		path.remove(path.size()-1); //�������ɾ����
	}

}
