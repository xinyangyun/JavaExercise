package JZ;

public class JZ48不用加减乘除做加法 {

	public int Add(int num1, int num2) {
		
		while (num2 != 0) {
			int c = (num1&num2) << 1; //c = 进位
			num1 ^=num2; //num1=非进位
			num2 = c;    //num2 = 进位
		}
		
		return num1;
	}

}
