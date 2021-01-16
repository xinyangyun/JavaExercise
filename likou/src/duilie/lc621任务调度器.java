package duilie;

import java.util.Arrays;

public class lc621��������� {
	public static void main(String[] args) {

	}

	public int leastInterval(char[] tasks, int n) {

		// 1.���������ͷ��飬����A-Z��һ��int[26]�����������͸���
		// 2.��������������������и�����count���������
		// ����õ���ʱ������ΪretCount =��count-1��* (n+1) + 1 ==> A->X->X->A->X->X->A(XΪ����������ߴ���)
		// 3.��������һ�����������һ������B���������������һ�£�
		// 4.�����λ������֮���������Ǿ��������Щ����������Ϳ��ԣ���Ϊ������ȿ϶������n������������¾����������������С����ʱ��

		if (tasks.length <= 1 || n < 1)
			return tasks.length;

		// ����1
		int[] counts = new int[26];
		for (int i = 0; i < tasks.length; i++) {
			counts[tasks[i] - 'A']++;
		}

		// ����2
		Arrays.sort(counts);
		int maxCount = counts[25];
		int retCount = (maxCount - 1) * (n - 1) + 1;
		int i = 24;
		
		//����3
		while (i >= 0 && counts[i] == maxCount) {
			retCount++;
			i--;
		}

		//����4
		return Math.max(retCount, tasks.length);
	}
}
