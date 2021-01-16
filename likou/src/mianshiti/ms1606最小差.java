package mianshiti;

import java.util.Arrays;

public class ms1606��С�� {
	public static void main(String[] args) {

	}

	public int smallestDifference(int[] a, int[] b) {

		int alen = a.length;
		int blen = b.length;

		Arrays.sort(a);
		Arrays.sort(b);

		int min = Integer.MAX_VALUE;

		int i = 0;
		int j = 0;
		while (i < alen && j < blen) {
			long diff = a[i] - b[j];
			min = (int) Math.min(Math.abs(diff), diff);
			if (diff < 0) {  //a[i] �� b[j]С���Ծ�i++
				i++;
			}else { //a[i] �� b[j] ������j++
				j++;
			}
		}

		return min;
	}
}
