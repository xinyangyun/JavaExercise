package JZ;

import java.util.LinkedList;
import java.util.Queue;

public class JZ61序列化二叉树 {

	
	//采用层序遍历，不需要将转化为完全二叉树的简单方法
	String Serialize(TreeNode root) {
		
		StringBuilder sb = new StringBuilder();
		
		Queue<TreeNode> queue = new LinkedList<>();
		
		
		if (root != null) {
			queue.add(root);
		}
		
		while (!queue.isEmpty()) {
			TreeNode node = queue.poll();
			if (node!=null) {
				queue.offer(node.left);
				queue.offer(node.right);
				sb.append(node.val+",");
			}else {
				sb.append("#"+','); //等于null为#
			}
		}
		
		if (sb.length()!=0) {
			sb.deleteCharAt(sb.length()-1);  //删除最后一个字符
		}
		
		return sb.toString();
	}

	TreeNode Deserialize(String str) {
		
		TreeNode head = null;
		
		if (str == null || str.length() == 0) {
			return head;
		}
		
		String[] nodes = str.split(",");
		
		TreeNode[] treeNodes = new TreeNode[nodes.length];
		
		for (int i = 0;i < nodes.length;i++) { //统计节点，放入treeNodes中
			if (!nodes[i].equals("#")) {
				treeNodes[i] = new TreeNode(Integer.valueOf(nodes[i]));
			}
		}
		
		for (int i = 0,j = 1;j<treeNodes.length;i++) {  //重新构建二叉树
			if (treeNodes[i]!=null) {
				treeNodes[i].left = treeNodes[j++];
				treeNodes[i].right = treeNodes[j++];
			}
		}
		
		return treeNodes[0];
	}

}
