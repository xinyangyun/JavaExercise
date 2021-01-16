package JZ;

public class JZ23二叉搜索树的后序遍历序列 {

	public boolean VerifySquenceOfBST(int[] sequence) {
		if (sequence.length == 0) {
            return false;
        }
		return recur(sequence, 0, sequence.length-1);
	}

	//先分成左子树和右子树，一直向下拆分
	boolean recur(int[] sequence,int i,int j) {
		
		if (i > j) {
			return true;
		}
		
		int p = i;
		
		while (sequence[p] < sequence[j])  p++;//左子树
			
		int m = p;
		
		while (sequence[p] > sequence[j]) p++;//右子树
		
		return p == j && recur(sequence, i, m - 1) && recur(sequence, m, j-1);
	}
	
}
