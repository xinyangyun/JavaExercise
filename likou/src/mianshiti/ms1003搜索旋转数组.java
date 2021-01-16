package mianshiti;

public class ms1003������ת���� {
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

			if (arr[left] < arr[mid]) { // ���������
				if (arr[left] <= target && target <= arr[mid]) {
					right = mid;
				} else {
					left = mid + 1;
				}
			} else if (arr[left] > arr[mid]) { // ��߲�������
				if (arr[left] <= target || target <= arr[mid]) {
					right = mid;
				} else {
					left = mid + 1;
				}
			}else if (arr[left] == arr[mid]) { //��ֵ������ֵ
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
