package paixu;

public class �鲢���� {
	public static void main(String[] args) {
		int[] arr = { 3, 2, 9, 8, 4, 7, 6, 5 };
		sort(arr, 0, arr.length-1);
		for (int i : arr) {
			System.out.println(i);
		}
	}

	public static int[] sort(int[] arr, int low, int high) {
		if (low < high) {
			int mid = (low + high) / 2;
			sort(arr, low, mid);
			sort(arr, mid + 1, high);
			// ���ҹ鲢
			merge(arr, low, mid, high);
		}
		return arr;
	}

	public static void merge(int[] arr, int low, int mid, int high) {
		int[] temp = new int[high - low + 1];
		int i = low,j = mid + 1,k = 0;
		// �ѽ�С�������Ƶ���������
		while (i <= mid && j <= high) {
			if (arr[i] < arr[j]) {
				temp[k++] = arr[i++];
			} else {
				temp[k++] = arr[j++];
			}
		}
		// �����ʣ�������������
		while (i <= mid) temp[k++] = arr[i++];
		// ���ұ߱�ʣ�������������
		while (j <= high) temp[k++] = arr[j++];	
		// ���������е�������nums����
		for (int x = 0; x < temp.length; x++) {
			arr[x + low] = temp[x];
		}
	}
}
