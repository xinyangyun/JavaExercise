package JZ;

public class JZ47��1��n�ĺ� {
	
	int res = 0;
	
	public int Sum_Solution(int n) {
		
		boolean  x= n > 1 && Sum_Solution(n-1) > 0;  // ��ֹ����
		res += n;
		return res;
	}
}
