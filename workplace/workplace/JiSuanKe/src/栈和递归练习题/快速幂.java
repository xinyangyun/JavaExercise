package 栈和递归练习题;

import java.util.Scanner;

public class 快速幂 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- != 0) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int p = sc.nextInt();
//			System.out.println(fx(x,y,p));
			System.out.println(fxx(x,y,p));
		}
		
		for (int i = 0; i < t; i++) {
			
		}
	}
	
	static long fx(int base,int power,int p) {
		if (power%2 == 0 && power> 0) {
			long temp = fx(base,power/2,p);
			return temp*temp%p;
		}else if (power==0){
			return 1%p;
		}else {
			long test = fx(base,power/2,p);
			return test*test%p*base%p;
		}
	}
	
	static long fxx(int base,int power,int p) {
		long result = 1;
		while (power > 0) {
			if (power%2==1) {
				result = result*base%p;
			}
			power/=2;
			base = (base*base)%p;
		}
		return result;
	}
}
