package 枚举算法;

import java.util.Scanner;

public class 四平方和 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		cast: for (int i = 0; i*i < n; i++) {  
			for (int j = i; i*i + j*j < n; j++) {
				for (int k = j; i*i + j*j + k*k <= n; k++) {
					int l0 = n - (i*i+j*j+k*k);
					int l = (int) Math.sqrt(l0);
					if (l*l == l0) {
						System.out.println(i+ " " + j+ " "+k+" " +l) ;
						break cast;
					}
				}
			}
		}
	}
}
