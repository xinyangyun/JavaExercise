package LC;

public class LC15����һ�ε����� {
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,4,1,2};
		singleNumber(arr);
	}

	public static int singleNumber(int[] A) {
		// write code here

		//�����
		//��ͬ�����������Ϊ0
		//0���һ����Ϊ�Ǹ�������
		
		int res = 0;
		
		for (int i = 0;i < A.length;i++) {
			
			res ^=A[i];
			System.out.println(res);
		}
		
		return res;
	}

}
