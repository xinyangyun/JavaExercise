package JZ;

import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class JZ59按之字形顺序打印二叉树 {

	public ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
	       ArrayList<ArrayList<Integer>> res = new ArrayList<>();
			
			Deque<TreeNode> queue = new LinkedList<>();
			
			if (pRoot == null) {
				return res;
			}
			queue.offer(pRoot);
			int depth = 0;
			while (!queue.isEmpty()) {
	            depth++;
				ArrayList<Integer> tmp = new ArrayList<>();
				int cur = 0,size = queue.size();
				if ( depth%2 == 0) {  //偶数行
					Iterator<TreeNode> it = queue.descendingIterator();
	                while (it.hasNext()) {
	                	tmp.add(it.next().val);
	                }
				}else {  //奇数行
					Iterator<TreeNode> it = queue.iterator();
	                while (it.hasNext()) {
	                	tmp.add(it.next().val);
	                }
				}
				
				while (cur < size) {
					TreeNode node = queue.poll();
					
					if (node.left != null) {
						queue.offer(node.left);
					}
					
					if (node.right != null) {
						queue.offer(node.right);
					}
					cur++;
				}
				
				res.add(tmp);
			}
			return res;
	    }

}
