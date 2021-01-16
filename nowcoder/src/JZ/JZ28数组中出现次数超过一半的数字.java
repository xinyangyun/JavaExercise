package JZ;

import java.util.Arrays;

public class JZ28数组中出现次数超过一半的数字 {

	public static void main(String[] args) {
		int[] x = { 1, 2, 3, 2, 4, 2, 5, 2, 3 };

		System.out.println(MoreThanHalfNum_Solution(x));
	}

	public static int MoreThanHalfNum_Solution(int[] array) {

//		int x = 0, votes = 0;
//		for (int num : array) {
//			if (votes == 0)
//				votes = num; //如果众数位票为0，那么就设为众数
//			votes += num == x ? 1 : -1;//如果众数不为0，且众数等于num票+1，不等于就减一
//		}
//		return x;

		Arrays.sort(array);
		int count = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] == array[array.length / 2]) {
				count++;
			}
		}

		if (count > array.length / 2) {
			return array[array.length / 2];
		} else {
			return 0;
		}

	}

}
