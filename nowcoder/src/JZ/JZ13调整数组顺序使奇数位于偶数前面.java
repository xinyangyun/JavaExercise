package JZ;

public class JZ13��������˳��ʹ����λ��ż��ǰ�� {

	public void reOrderArray(int[] array) {

		int length = array.length;
		int k = 0; //��¼�Ѿ��ں�λ�õ������ĸ���

		for (int i = 0; i < length; i++) {
			if (array[i] % 2 == 1) {  //ż�����䣬������������ǰ�ƶ�
				int j = i;
				while (j > k) { //����������k��
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
