package JZ;

public class JZ37���������������г��ֵĴ��� {

	public int GetNumberOfK(int[] array, int k) {
		
		//���ֲ���
		//�����ҵ���߽磬���ҵ��ұ߽�Ȼ���Ҽ�ȥ��
		
		int left = 0,right = array.length - 1;
		
		int count = 0;
		
		while (left < right ) {
			int mid = (left + right) /2;
			
			if (array[mid] >= k) {
				right = mid;
			}
			if (array[mid] < k) {
				left = mid + 1;
			}
		}
		
		while (left < array.length && array[left++] == k) {
			count++;
		}
		
		return count;
	}

}
