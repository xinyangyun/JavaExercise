package �����㷨;

public class ��ѡ������ {
	public static void main(String[] args) {
		int[] x = { 6, 2, 4, 1, 5, 9 };
		selectSort(x);
		for (int i : x) {
			System.out.println(i + ",");
		}
	}
	
	public static void selectSort(int[] a) {
		int length = a.length;
		for (int i = 0; i < a.length-1; i++) { //ѭ������
			int min_index = i;
			for (int j = i+1; j < a.length; j++) {//ÿ�ֵıȽ�
				if (a[min_index] > a[j]) {//�ҵ���Сֵ���±�
					min_index = j;
				}
			}
			if (min_index!=i) { //������С��a[min_index]�͵�iλ����λ��
				int temp = a[min_index];
				a[min_index] = a[i];
				a[i] = temp;
			}
		}
	}
}
