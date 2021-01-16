package com.lianxi1;

import java.util.Scanner;

public class o14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(cuttingRope(n));
	}

	public static int cuttingRope(int n) {
		
		if(n<=3) return n - 1;
		int a = n / 3, b = n % 3;
		if (b == 0) return (int) Math.pow(3, a); 
		if (b == 1) return (int) Math.pow(3, a - 1) * 4;
		
		return (int) Math.pow(3, a) * 2;
	}
}
