package 排序算法;

import java.util.Scanner;

public class 桶排序 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[11];
		
		for (int i = 0; i < 11; i++) { //初始化
			arr[i] = 0;
		}
		
		for (int i = 0; i < 5; i++) { //循环读入5个数
			int x = sc.nextInt();
			arr[x]++;
		}
		
		for (int i = 0; i < 10; i++) {
			for (int j = 1; j <= arr[i]; j++) {
				System.out.println(i);
			}
		}
		
	}
	
}
