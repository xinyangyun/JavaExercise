package mianshiti;

public class ms1601交换数字 {
	public static void main(String[] args) {
		
	}
	
	public int[] swapNumbers(int[] numbers) {
		
		//使用加法
		numbers[0] = numbers[0] + numbers[1];
		
		numbers[1] = numbers[0] - numbers[1];
		
		numbers[0] = numbers[0] - numbers[1];
		
		return numbers;
    }
	
}
