package mianshiti;

public class ms1001�ϲ���������� {
	public static void main(String[] args) {
		
	}
	
	public void merge(int[] A, int m, int[] B, int n) {
		int i = m - 1,j = n - 1;
		while (i >= 0 && j >= 0) {  //A,B��������
			if (B[j]>=A[i]) {
				A[i+j+1] = B[j--];
			}else {
				A[i+j+1] = A[i--];
			}
		}
		while (j >= 0) { //��ʱB����ʣ�£���ΪAʣ���������
			A[j] = B[j--];
		}
    }
}
