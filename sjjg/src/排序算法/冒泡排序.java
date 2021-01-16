package ≈≈–ÚÀ„∑®;

public class √∞≈›≈≈–Ú {
	public static void main(String[] args) {
		int[] x = { 6, 2, 4, 1, 5, 9 };
		bubbleSort(x);
		for (int i : x) {
			System.out.println(i + ",");
		}
	}
	
	public static void bubbleSort(int[] a) {
		int length = a.length;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length-i-1; j++) {
				if (a[j] > a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;	
				}
			}
		}
	}
	
}
