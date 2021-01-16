package JZ;

public class JZ7ì³²¨À­ÆõÊýÁÐ {
	
	public static void main(String[] args) {
		System.out.println(Fibonacci(4));
	}

	public static int Fibonacci(int n) {
		if (n == 0) {
			return 0;
		}
		
		if (n == 1) {
			return 1;
		}
		
		else if(n == 2) {
			return 1;
		}
		
		else return Fibonacci(n-1) + Fibonacci(n-2);
		
	}

}
