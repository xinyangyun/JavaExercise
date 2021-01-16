package JZ;

public class JZ47求1到n的和 {
	
	int res = 0;
	
	public int Sum_Solution(int n) {
		
		boolean  x= n > 1 && Sum_Solution(n-1) > 0;  // 终止条件
		res += n;
		return res;
	}
}
