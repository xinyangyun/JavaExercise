package xunlian2;

import java.util.HashMap;

public class o7ÖØ½¨¶þ²æÊ÷ {
	static HashMap<Integer,Integer> map = new HashMap<>();
	static int[] preorder3;
	
	public static void main(String[] args) {
		int[] preorder2 = {3,9,20,15,7};
		int[] inorder = {9,3,15,20,7};
		
		buildTree(preorder2, inorder);
		
	}

	public static TreeNode buildTree(int[] preorder, int[] inorder) {
		
		preorder3 = preorder;
		
		for (int i = 0; i < preorder3.length; i++) {
			map.put(inorder[i], i);
		}
		return recursive(0, 0, inorder.length-1);
	}
	
	public static TreeNode recursive(int pre_root_idx, int in_left_idx, int in_right_idx) {
		
		if (in_left_idx > in_right_idx) {
			return null;
		}
		
		TreeNode root = new TreeNode(preorder3[pre_root_idx]);
		
		int idx = map.get(preorder3[pre_root_idx]);
		
		root.left = recursive(pre_root_idx+1, in_left_idx, idx-1);
		
		root.right = recursive(pre_root_idx+(idx-1-in_left_idx+1)+1, idx+1, in_right_idx);
		
		return root;
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