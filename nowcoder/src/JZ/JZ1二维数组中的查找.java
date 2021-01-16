package JZ;

public class JZ1二维数组中的查找 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean Find(int target, int[][] array) {

		for (int i = 0; i < array.length; i++) {
			int low = 0;
			int high = array[i].length-1;

			while (low <= high) {
				int mid = (low + high) / 2;
				if (target > array[i][mid]) {
					low = mid + 1;
				} else if (target < array[i][mid]) {
					high = mid - 1;
				} else
					return true;
			}

		}

		return false;
		
	}

}
