package �����㷨;

public class ϣ������ {
	public static void main(String[] args) {
		int[] x = { 6, 2, 4, 1, 5, 9 };
		sheelSort(x);
		for (int i : x) {
			System.out.println(i + ",");
		}
	}

	public static void sheelSort(int[] a) {
		int d = a.length;

		while (true) {
			d = d / 2; // ÿ�ζ���gap��ֵ����

			for (int x = 0; x < d; x++) {
				for (int i = x + d; i < a.length; i = i + d) {
					int temp = a[i];
					int j;
					for (j = i - d; j >= 0 && a[j] > temp; j = j - d) {
						a[j + d] = a[j]; // ����
					}
					a[j + d] = temp;
				}
			}
			if (d == 1) { // ��gapΪ1����ѭ��
				break;
			}
		}

	}

}
