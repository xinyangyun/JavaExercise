package mianshiti;

public class ms1001合并排序的数组 {
	public static void main(String[] args) {
		
	}
	
	public void merge(int[] A, int m, int[] B, int n) {
		int i = m - 1,j = n - 1;
		while (i >= 0 && j >= 0) {  //A,B都还有树
			if (B[j]>=A[i]) {
				A[i+j+1] = B[j--];
			}else {
				A[i+j+1] = A[i--];
			}
		}
		while (j >= 0) { //此时B还有剩下，因为A剩下是有序的
			A[j] = B[j--];
		}
    }
}
