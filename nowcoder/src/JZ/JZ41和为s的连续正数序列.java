package JZ;

import java.util.ArrayList;

public class JZ41��Ϊs�������������� {

	public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
		
		//���û������ڽ��⣬�������ھ�����һ�����������е�һ����������������ƶ�
		//Ȼ��ȡһ����
		
		int i = 1;//�������ڵ���߽�
		int j = 1;//�������ڵ��ұ߽�
		
		int sum2  = 0;//����������
		ArrayList<ArrayList<Integer>> res = new ArrayList<>();
		
		while (i <= sum/2) { //���i=sum/2��i+i=sum��
			if (sum2 <  sum) {
				//�ұ߽������ƶ�
				sum2+=j;
				j++;
			}
			else if (sum2 > sum) {
				//��߽������ƶ�
				sum2 -= i;
				i++;
			}
			else {
				//��¼���
				ArrayList<Integer> arr = new ArrayList<>();
				for (int k = i;k < j;k++) {
					arr.add(k);
				}
				res.add(arr);
				//��߽������ƶ�
				sum2-=i;
				i++;
			}
		}
		
		return res;
	}

}
