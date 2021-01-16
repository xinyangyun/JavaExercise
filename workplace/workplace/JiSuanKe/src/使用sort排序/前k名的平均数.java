package 使用sort排序;

import java.util.Arrays;
import java.util.Scanner;

public class 前k名的平均数 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] stu = new int[35];
		
		int n = sc.nextInt();  
		
		for (int i = 0; i < n; i++) { 
			stu[i] = sc.nextInt();
		}
		
		int k = sc.nextInt();
		Arrays.sort(stu,0,n);
		int sum = 0;
		for (int i = n-1; i >= n-k; i--) {
			sum +=stu[i];
		}
		System.out.printf("%.2f",1.00*sum/k);
	}
}
