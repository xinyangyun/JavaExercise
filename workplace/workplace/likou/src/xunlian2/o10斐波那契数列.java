package xunlian2;

public class o10ì³²¨ÄÇÆõÊıÁĞ {

	public static void main(String[] args) {
		System.out.println(fib(5));
	}

	public static int fib(int n) {
		if (n==0) return 0;
		if (n==1) return 1;
		int sum = 0;
		int p1 = 0;
		int p2 = 1;
		for (int i = 1; i < n; i++) {
			sum = (p1+p2)%1000000007;
			p1 = p2;
			p2 = sum;
		}
		return sum;
	}

	public static int fib2(int n) {

		if (n == 1) {
			return 1;
		} else if (n == 0) {
			return 0;
		} else {
			return (fib(n - 1) + fib(n - 2)) % 1000000007;
		}

	}
}
