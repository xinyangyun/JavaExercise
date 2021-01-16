package 排序算法;

public class 希尔排序 {
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
			d = d / 2; // 每次豆浆gap的值减半

			for (int x = 0; x < d; x++) {
				for (int i = x + d; i < a.length; i = i + d) {
					int temp = a[i];
					int j;
					for (j = i - d; j >= 0 && a[j] > temp; j = j - d) {
						a[j + d] = a[j]; // 交换
					}
					a[j + d] = temp;
				}
			}
			if (d == 1) { // 当gap为1跳出循环
				break;
			}
		}

	}

}
