package erfenchazhao;

public class lc74搜索二维矩阵 {
	public static void main(String[] args) {

	}

	//二分查找行，然后二分查找列，注意行的边界
	public boolean searchMatrix(int[][] matrix, int target) {
		if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
			return false;
		}

		int lm = 0;
		int rm = matrix.length - 1;
		while (lm <= rm) {
			int mid = lm + (rm - lm) / 2;
			if (matrix[mid][0] == target) {
				return true;
			}
			if (matrix[mid][0] < target) {
				lm = mid + 1;
			} else {
				rm = mid - 1;
			}
		}
		if (lm > matrix.length - 1 || (lm > 0) && matrix[lm][0] > target) {
			lm--;
		}

		int ln = 0;
		int rn = matrix[0].length - 1;
		while (ln <= rn) {
			int mid = ln + (rn - ln) / 2;
			if (matrix[lm][mid] == target) {
				return true;
			}
			if (matrix[lm][mid] < target) {
				ln = mid + 1;
			} else {
				rn = mid - 1;
			}

		}
		return false;
	}
}
