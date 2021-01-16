package 算法;

public class 快速排序 {
	public static void main(String[] args) {

		int[] arr = {10,7,2,4,7,62,3,4,2,1,8,9,19};
		sort(arr, 0, arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

	}

	public static void sort(int[] a, int low, int high) {
		int start = low;
		int end = high;
		int key = a[low]; //找基数
		while (end > start) {
			while(end>start&&a[end]>=key)//
			end--;
			if(a[end]<=key) {
				int temp = a[end];
				a[end] = a[start];
				a[start] = temp;
			}
			while(end>start&&a[start] <= key)
				start++;
			if(a[start]>=key) {
				int temp = a[start];
				a[start] = a[end];
				a[end] = temp;
			}
		}
		if(start>low) sort(a, low, start-1);
		if(end<high) sort(a,end+1, high);
	}
}
