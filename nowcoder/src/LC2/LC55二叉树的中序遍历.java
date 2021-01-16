package LC2;

import java.util.ArrayList;
import java.util.Stack;

public class LC55��������������� {

	public ArrayList<Integer> inorderTraversal (TreeNode root) {
		//�ǵݹ�ʵ�ֶ��������������
		Stack<TreeNode> stack = new Stack<>();
		ArrayList<Integer> res = new ArrayList<>();
		TreeNode node = root;
		while (!stack.isEmpty() || node != null) {
			while (node != null) {  //�Ƚ�ջ
				stack.push(node);
				node = node.left;
			}
			node = stack.pop(); //��ջ�����������͸��ڵ�
			res.add(node.val); 
			node = node.right; //�ҽڵ�
		}
		return res;
    }
	
}
