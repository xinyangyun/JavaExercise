package JZ;

import java.util.Arrays;

public class JZ28�����г��ִ�������һ������� {

	public static void main(String[] args) {
		int[] x = { 1, 2, 3, 2, 4, 2, 5, 2, 3 };

		System.out.println(MoreThanHalfNum_Solution(x));
	}

	public static int MoreThanHalfNum_Solution(int[] array) {

//		int x = 0, votes = 0;
//		for (int num : array) {
//			if (votes == 0)
//				votes = num; //�������λƱΪ0����ô����Ϊ����
//			votes += num == x ? 1 : -1;//���������Ϊ0������������numƱ+1�������ھͼ�һ
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
