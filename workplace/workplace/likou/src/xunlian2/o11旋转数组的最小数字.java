package xunlian2;

public class o11旋转数组的最小数字 {

	public static void main(String[] args) {
		
		
		int[] arr = {2,2,2,0,1};
		
		System.out.println(minArray(arr));
	}
	
	public static int minArray(int[] numbers) {
		
		int i = 0,j = numbers.length-1;
		while (i<j ) {
			int m = (i+j)/2;
			if (numbers[m] > numbers[j]) i = m+1;
			else if (numbers[m] < numbers[j] ) j = m;
			else j--;
		}
		
		return numbers[i];
    }
}
