package JZ;

import java.util.LinkedList;
import java.util.Queue;

public class JZ61���л������� {

	
	//���ò������������Ҫ��ת��Ϊ��ȫ�������ļ򵥷���
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
				sb.append("#"+','); //����nullΪ#
			}
		}
		
		if (sb.length()!=0) {
			sb.deleteCharAt(sb.length()-1);  //ɾ�����һ���ַ�
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
		
		for (int i = 0;i < nodes.length;i++) { //ͳ�ƽڵ㣬����treeNodes��
			if (!nodes[i].equals("#")) {
				treeNodes[i] = new TreeNode(Integer.valueOf(nodes[i]));
			}
		}
		
		for (int i = 0,j = 1;j<treeNodes.length;i++) {  //���¹���������
			if (treeNodes[i]!=null) {
				treeNodes[i].left = treeNodes[j++];
				treeNodes[i].right = treeNodes[j++];
			}
		}
		
		return treeNodes[0];
	}

}
