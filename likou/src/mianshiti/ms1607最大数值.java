package mianshiti;

public class ms1607�����ֵ {
	public static void main(String[] args) {

	}

	public int maximum(int a, int b) {

		// ����ʹ��if-else�������Ƚ������
		long dif = (long) a - (long) b;

		int k = (int) (dif >>> 63);

		return a * (k ^ 1) + b * k;
	}
}
