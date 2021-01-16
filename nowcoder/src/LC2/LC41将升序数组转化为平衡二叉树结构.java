package LC2;

public class LC41����������ת��Ϊƽ��������ṹ {

	public TreeNode sortedArrayToBST (int[] num) {
		if (num == null || num.length == 0) {
			return null;
		}
		return sortedArrayToBST(num,0,num.length-1);
    }
	
	private TreeNode sortedArrayToBST(int[] nums,int left,int right) {
		if (right < left) {
			return null;
		}
		if (left == right) {
			return new TreeNode(nums[left]);
		}
		int mid = left + (right - left + 1) /2;
		TreeNode root = new TreeNode(nums[mid]);
		root.left = sortedArrayToBST(nums,left,mid-1);
		root.right = sortedArrayToBST(nums,mid+1,right);
		return root;
	}
	
}
