package 栈和递归练习题;

import java.util.Scanner;

public class 斐波那契数列 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,a,b,p;
		
		n = sc.nextInt();
		a = sc.nextInt();
		b = sc.nextInt();
		p = sc.nextInt();
		
		int[] arr = new int[105];
		arr[1] = 1;
		arr[2] = 1;
		
		for (int i = 3; i <= n; i++) {
			arr[i]  = (arr[i-1]*a + arr[i-2]*b) % p;
		}
		System.out.println(arr[n]);
	}
}
