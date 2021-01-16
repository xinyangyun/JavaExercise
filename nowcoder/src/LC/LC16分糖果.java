package LC;

import java.util.Arrays;

public class LC16���ǹ� {
	public int candy(int[] ratings) {
		
		if (ratings == null || ratings.length == 0) {
			return 0;
		}
		
		int[] count = new int[ratings.length];
		
		//ÿ�����ӳ�ʼ����һ���ǹ�
		Arrays.fill(count, 1);
		
		for (int i = 1;i < ratings.length;i++) { //��ǰ�������
			if (ratings[i] > ratings[i-1]) {
				count[i] = count[i-1] +1 ;
			}
		}

		int sum = 0; 
		for (int i =ratings.length-1;i > 0;i--) { //�Ӻ���ǰ����
			sum+=count[i];
			if (ratings[i] < ratings[i-1] && count[i] >= count[i-1]) {
				count[i-1] = count[i]+1;
			}
 		}
		
		sum+=count[0];
		return sum;
	}
}
