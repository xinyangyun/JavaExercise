package ջ�͵ݹ���ϰ��;

import java.util.Scanner;

public class ���Լ�� {
	static int x,y;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			x = sc.nextInt();
			y = sc.nextInt();
			System.out.println(fx(x,y));
		}
	}
	
	static int fx(int x,int y ) {
		if (y == 0 ) {
			return x;
		}else {
			return fx(y,x%y);
		}
	}
}
