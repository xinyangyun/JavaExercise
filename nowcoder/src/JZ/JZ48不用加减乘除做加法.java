package JZ;

public class JZ48���üӼ��˳����ӷ� {

	public int Add(int num1, int num2) {
		
		while (num2 != 0) {
			int c = (num1&num2) << 1; //c = ��λ
			num1 ^=num2; //num1=�ǽ�λ
			num2 = c;    //num2 = ��λ
		}
		
		return num1;
	}

}
