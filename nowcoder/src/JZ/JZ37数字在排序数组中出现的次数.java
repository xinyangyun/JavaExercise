package JZ;

public class JZ37数字在排序数组中出现的次数 {

	public int GetNumberOfK(int[] array, int k) {
		
		//二分查找
		//或者找到左边界，再找到右边界然后右减去左
		
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
