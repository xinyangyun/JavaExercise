package paixu;

public class �������� {
	public static void main(String[] args) {
		int[] arr = { 3, 2, 9, 8, 4, 7, 6, 5 };
		quickSort(arr,0,arr.length-1);
		for (int i : arr) {
			System.out.println(i);
		}
	}

	public static void quickSort(int[] arr, int low, int high) {
		int i, j, temp, t;
		if (low > high) {
			return;
		}
		i = low;
		j = high;
		// temp���ǻ�׼λ
		temp = arr[low];

		while (i < j) {
			// �ȿ��ұߣ���������ݼ�
			while (temp <= arr[j] && i < j) {
				j--;
			}
			// �ٿ���ߣ��������ҵ���
			while (temp >= arr[i] && i < j) {
				i++;
			}
			// ������������򽻻�
			if (i < j) {
				t = arr[j];
				arr[j] = arr[i];
				arr[i] = t;
			}

		}
		// ��󽫻�׼Ϊ��i��j���λ�õ����ֽ���
		arr[low] = arr[i];
		arr[i] = temp;
		// �ݹ�����������
		quickSort(arr, low, j - 1);
		// �ݹ�����Ұ�����
		quickSort(arr, j + 1, high);

	}
}
