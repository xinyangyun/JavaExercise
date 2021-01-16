package mianshiti;

public class ms1003搜索旋转数组 {
	public static void main(String[] args) {

	}

	public int search(int[] arr, int target) {

		int left = 0;
		int right = arr.length - 1;

		if (right == -1) {
			return -1;
		}

		while (left < right) {
			int mid = left + (right - left) / 2;

			if (arr[left] < arr[mid]) { // 左边是升序
				if (arr[left] <= target && target <= arr[mid]) {
					right = mid;
				} else {
					left = mid + 1;
				}
			} else if (arr[left] > arr[mid]) { // 左边不是升序
				if (arr[left] <= target || target <= arr[mid]) {
					right = mid;
				} else {
					left = mid + 1;
				}
			}else if (arr[left] == arr[mid]) { //左值等于中值
				if (arr[left] != target) {
					left++;
				}else {
					right = left;
				}
			}

		}

		return (arr[left]==target) ? left:-1;
	}

}
