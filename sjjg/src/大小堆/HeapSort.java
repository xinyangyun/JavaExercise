package ��С��;

public class HeapSort {
	
	static int[] data;
	
	public static void main(String[] args) {
		HeapSort heapSort = new HeapSort();
		int[] data = {1, 2, 5, 12, 7, 17, 25,19, 36, 99, 22, 28, 46, 9};
		heapSort.data = data;
		heapSort.buildHeap();
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[0] + ",");
			data[0] = Integer.MAX_VALUE;
			heapSort.buildHeap();
		}
	}
	
	//������ת��Ϊ��С��
	public void buildHeap() {
		//��ȫ������ֻ�������±����ڣ�data.length��/2-1��Ԫ���к��ӽڵ㣬������Щ�ڵ�
		//��length/2���ڵ�Ԫ�أ����ڵ��λ���Ǵ�0-length/2-1
		for (int i = (data.length) / 2 -1; i >= 0;i-- ) {
			//���к��ӽڵ��Ԫ��heapify
			heapfiy(i);
		}
	}
	
	//��iԪ���½������ʵ�λ��
	private void heapfiy(int i) {
		//��ȡ���ҽڵ�������±�
		int l = left(i);
		int r = right(i);
		
		//����һ����ʱ��������ʾ���ڵ㣬��ڵ㣬�ҽڵ�����С��ֵ�Ľڵ���±�
		int smallest = i;
		
		//������ڵ㣬����ڵ��ֵС�ڸ��ڵ��ֵ
		if (l < data.length && data[l] < data[i]) {
			smallest = l;
		}
		
		//�����ҽڵ㣬���ҽڵ��ֵС�����ϱȽϵĽ�Сֵ
		if (r < data.length && data[r] < data[smallest]) {
			smallest = r;
		}
		
		//���ҽڵ��ֵ�����ڸ��ڵ㣬ֱ��return�������κβ���
		if (i == smallest) return;
		
		//�������ڵ�����ҽڵ�����С��ֵ���Ѹ��ڵ��ֵ�滻��ȥ
		swap(i, smallest);
		
		//�����滻������������Ӱ�졣����Ҫ����Ӱ��������ٽ���heapfiy
		heapfiy(smallest);
		
	}
	
	//��ȡ���ڵ����ڵ�
	private int left(int i) {
		return i  * 2 + 1;
	}
	
	//��ȡ���ڵ��ҽڵ�
	private int right(int i) {
		return i *2 + 2;
	}
	
	//���������±�Ϊa��b��λ��
	public void swap(int a,int b) {
		int temp = data[a];
		data[a] = data[b];
		data[b] = temp;
	}
	
	//��ӡ��
	public static void printHeap() {
		HeapSort heapSort = new HeapSort();
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[0] + ",");
			data[0] = Integer.MAX_VALUE;
			heapSort.buildHeap();
		}
	}
	
}
