package mianshiti;

public class ms1607最大数值 {
	public static void main(String[] args) {

	}

	public int maximum(int a, int b) {

		// 不得使用if-else或其他比较运算符
		long dif = (long) a - (long) b;

		int k = (int) (dif >>> 63);

		return a * (k ^ 1) + b * k;
	}
}
