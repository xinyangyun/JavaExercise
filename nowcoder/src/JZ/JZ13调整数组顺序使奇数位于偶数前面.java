package JZ;

public class JZ13调整数组顺序使奇数位于偶数前面 {

	public void reOrderArray(int[] array) {

		int length = array.length;
		int k = 0; //记录已经摆好位置的奇数的个数

		for (int i = 0; i < length; i++) {
			if (array[i] % 2 == 1) {  //偶数不变，遇到奇数就向前移动
				int j = i;
				while (j > k) { //将奇数放在k中
					int tmp = array[j];
					array[j] = array[j-1];
					array[j-1] = tmp;
					j--;
				}
				k++;
			}
		}

	}

}
