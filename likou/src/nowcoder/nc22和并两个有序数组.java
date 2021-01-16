package nowcoder;

public class nc22和并两个有序数组 {
	public static void main(String[] args) {

	}

	public void merge(int A[], int m, int B[], int n) {
		int[] result = new int[m + n];

		int t = 0;
		int i = 0,j=0;
		
		while (i < m && j < n) {
			if (A[i] <= B[j]) {
				result[t++] = A[i++];
			}else {
				result[t++] = B[j++];
			}
		}
		
		while (i < m) {
			result[t++] = A[i++];
		}
		
		while (j < n) {
			result[t++] = B[j++];
		}
		
		for (int sum = 0;sum < result.length;sum++) {
			A[sum] = result[sum];
		}

	}

}
