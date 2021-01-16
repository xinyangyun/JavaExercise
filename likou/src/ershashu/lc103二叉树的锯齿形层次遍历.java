package ershashu;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class lc103二叉树的锯齿形层次遍历 {
	public static void main(String[] args) {
		
	}
	
	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
		List<List<Integer>> lists = new ArrayList<>();
		if (root == null) return lists;
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);
		int temp = 0;
		
		while ((!queue.isEmpty())) {
			List<Integer> list = new ArrayList<>();
			int num = queue.size();
			for (int i = 0;i<num;i++) {
				TreeNode node = queue.poll();
				list.add(node.val);
				if (node.left!=null) queue.offer(node.left);
				if (node.right!=null) queue.offer(node.right);
			}
			if (temp%2==1) {
				Collections.reverse(list); //如果是奇数层就反转
			}
			lists.add(list);
			temp+=1;
			
		}
		return lists;
    }
}
