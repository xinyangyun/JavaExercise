package mianshiti;

public class ms1601�������� {
	public static void main(String[] args) {
		
	}
	
	public int[] swapNumbers(int[] numbers) {
		
		//ʹ�üӷ�
		numbers[0] = numbers[0] + numbers[1];
		
		numbers[1] = numbers[0] - numbers[1];
		
		numbers[0] = numbers[0] - numbers[1];
		
		return numbers;
    }
	
}
