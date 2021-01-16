package com.lianxi2;

public class o33 {
	public static void main(String[] args) {
		
	}
	
	public boolean verifyPostorder(int[] postorder) {
		return recur(postorder, 0, postorder.length-1);
    }

	//先分成左子树和右子树，一直向下拆分
	boolean recur(int[] postorder,int i,int j) {
		if (i > j) return true;
		
		int p = i;
		
		while (postorder[p] < postorder[j]) p++;  //左子树
		
		int m = p;
		
		while (postorder[p] > postorder[j]) p++;  //右子树
		
		return  p == j && recur(postorder, i, m-1) && recur(postorder, m, j-1);
		
	}
	
}

