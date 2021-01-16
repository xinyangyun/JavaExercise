package suanfa;

import java.math.BigInteger;
import java.util.Scanner;

public class �������� {
	
	final static BigInteger NUM20 = BigInteger.valueOf(20);
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println(kaifang(input.next()));
	}
	
	//���㷨����
	public static String kaifang(String s) {
		String result = "0";//�����ʼ��Ϊ0
		String remainder = "";//����
		
		if (s.length() % 2 != 0) {
			s  = "0" + s;
		}
		
		for (int i = 0;i < s.length() / 2;i++) {//��������
			remainder += s.substring(i*2,(i + 1) * 2);//����Ϊ֮ǰ�Ľ�����Ϻ���2������
			int shang  = f1(new BigInteger(remainder),new BigInteger(result));
			remainder = f2(new BigInteger(remainder),new BigInteger(result),BigInteger.valueOf(shang));
			result += shang;
		}
		return result.substring(1);//ȥ�����֮���0
	}
	
	public static int f1(BigInteger remainder,BigInteger result) {
		int i;
		for (i = 9; i >= 0;i--) {
			BigInteger NUMI = BigInteger.valueOf(i);
			if (result.multiply(NUM20).add(NUMI).multiply(NUMI).compareTo(remainder) <= 0)
				break;
		}
		return i;
	}
	
	public static String f2(BigInteger remainder, BigInteger result, BigInteger shang) {
        return remainder.subtract(result.multiply(NUM20).add(shang).multiply(shang)).toString();
    }
	
}
