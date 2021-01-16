package 大小堆;

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
	
	//将数组转换为最小堆
	public void buildHeap() {
		//完全二叉树只有数组下标或等于（data.length）/2-1的元素有孩子节点，遍历这些节点
		//有length/2个节点元素，而节点的位置是从0-length/2-1
		for (int i = (data.length) / 2 -1; i >= 0;i-- ) {
			//对有孩子节点的元素heapify
			heapfiy(i);
		}
	}
	
	//让i元素下降到合适的位置
	private void heapfiy(int i) {
		//获取左右节点的数组下标
		int l = left(i);
		int r = right(i);
		
		//这是一个临时变量，表示跟节点，左节点，右节点中最小的值的节点的下标
		int smallest = i;
		
		//存在左节点，且左节点的值小于跟节点的值
		if (l < data.length && data[l] < data[i]) {
			smallest = l;
		}
		
		//存在右节点，且右节点的值小于以上比较的较小值
		if (r < data.length && data[r] < data[smallest]) {
			smallest = r;
		}
		
		//左右节点的值都大于跟节点，直接return，不做任何操作
		if (i == smallest) return;
		
		//交换根节点和左右节点中最小的值，把根节点的值替换下去
		swap(i, smallest);
		
		//由于替换后左右子树会影响。所以要对受影响的子树再进行heapfiy
		heapfiy(smallest);
		
	}
	
	//获取跟节点的左节点
	private int left(int i) {
		return i  * 2 + 1;
	}
	
	//获取根节点右节点
	private int right(int i) {
		return i *2 + 2;
	}
	
	//交换数组下标为a和b的位置
	public void swap(int a,int b) {
		int temp = data[a];
		data[a] = data[b];
		data[b] = temp;
	}
	
	//打印堆
	public static void printHeap() {
		HeapSort heapSort = new HeapSort();
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[0] + ",");
			data[0] = Integer.MAX_VALUE;
			heapSort.buildHeap();
		}
	}
	
}
