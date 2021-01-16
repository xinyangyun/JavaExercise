package 排序算法;

public class 直接插入排序 {
	public static void main(String[] args) {
		int[] x = {6,2,4,1,5,9};
		
		insertSort(x);
		for (int i : x) {
			System.out.println(i+",");
		}
		
	}
	
	
	public static void insertSort(int[] a) {
		int temp = 0,j;
		for (int i = 1; i < a.length; i++) {
			if (a[i - 1] > a[i]) {
				temp = a[i];
				j = i;
				while (j > 0 && a[j -1] > temp) {
					a[j] = a[j-1];
					j--;
				}
				a[j] = temp;
			}
		}
	}
	
}
