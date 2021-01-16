package LC;

public class LC15出现一次的数字 {
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,4,1,2};
		singleNumber(arr);
	}

	public static int singleNumber(int[] A) {
		// write code here

		//异或定理
		//相同的两个数异或为0
		//0异或一个数为那个数本身
		
		int res = 0;
		
		for (int i = 0;i < A.length;i++) {
			
			res ^=A[i];
			System.out.println(res);
		}
		
		return res;
	}

}
