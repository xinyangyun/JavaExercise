package com.lianxi3;

import java.util.ArrayList;
import java.util.List;

public class o57II {
	public static void main(String[] args) {
		
	}
	
	public int[][] findContinuousSequence(int target) {
		//���û������ڽ��⣬�������ھ�����һ�����������е�һ����������������ƶ�Ȼ��
		//ȡһ����
		
		int i = 1;//�������ڵ���߽�
		int j = 1;//�������ڵ��ұ߽�
		int sum = 0;//����������
		List<int[]> res = new ArrayList<>();
		
		while (i <= target/2) {
			if (sum < target) {
				//�ұ߽������ƶ�
				sum += j;
				j++;
			}else if (sum > target) {
				//��߽������ƶ�
				sum -= i;
				i++;
			}else {
				//��¼���
				int[] arr = new int[j-i];
				for (int k = i; k < j; k++) {
					arr[k-i] = k;
				}
				res.add(arr);
				//��߽������ƶ�
				sum-=i;
				i++;
			}
			
		}
		return res.toArray(new int[res.size()][]);
    }
}
