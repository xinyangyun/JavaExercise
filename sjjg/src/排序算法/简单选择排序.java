package 排序算法;

public class 简单选择排序 {
	public static void main(String[] args) {
		int[] x = { 6, 2, 4, 1, 5, 9 };
		selectSort(x);
		for (int i : x) {
			System.out.println(i + ",");
		}
	}
	
	public static void selectSort(int[] a) {
		int length = a.length;
		for (int i = 0; i < a.length-1; i++) { //循环次数
			int min_index = i;
			for (int j = i+1; j < a.length; j++) {//每轮的比较
				if (a[min_index] > a[j]) {//找到最小值的下标
					min_index = j;
				}
			}
			if (min_index!=i) { //交换最小数a[min_index]和第i位数的位置
				int temp = a[min_index];
				a[min_index] = a[i];
				a[i] = temp;
			}
		}
	}
}
