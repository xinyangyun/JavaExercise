package JZ;

public class JZ35数组中的逆序对 {
	
	int cnt;	

	public int InversePairs(int[] array) {
		//使用归并排序
		//ab中的逆序对 = a中的逆序对+b中的逆序对+ab混合在一起的逆序对
		MergeSort(array, 0, array.length-1);
		return cnt;
	}
	
	public void MergeOne(int[] array,int start,int mid,int end) {
		int[] temp = new int[end-start+1];
		
		int k = 0,i = start,j = mid+1;
		
		while (i <= mid && j <= end) {
			if (array[i] <= array[j]) {
				temp[k++] = array[i++];
			}else {
				temp[k++] = array[j++];
				cnt = (cnt+ (mid-i+1))%1000000007;
			}
		}
		while (i <= mid) {
			temp[k++] = array[i++];
		}
		while (j <= end ) {
			temp[k++] = array[j++];
		}
		for (int l = 0;l< k;l++) {
			array[start+l] = temp[l];
		}
	}
	
	public void MergeSort(int[] array,int start,int end) {
		if (start >= end ) {
			return;
		}
		int mid = (start+end)/2;
		MergeSort(array, start, mid);
		MergeSort(array, mid+1, end);
		MergeOne(array, start, mid, end);
	}

}
