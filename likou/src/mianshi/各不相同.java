package mianshi;

import java.util.Scanner;

//我们希望一个序列中的元素是各不相同的，但是理想和现实往往是有差距的。现在给出一个序列A，其中
//难免有些相同的元素，现在提供了一种变化方式，使得经过若干次操作后一定可以得到一个元素各不相同的序列。
//这个操作是这样的，令x为序列中最小的有重复的数字，你需要删除序列左数第一个x，并把第二个x替换为2*x。
//请你输出最终的序列。
//例如原序列是[2,2,1,1,1],一次变换后变为[2,2,2,1]，两次变换后变为[4,2,1]，变换结束
//5
//5 5 5 5 4
//20 4

public class 各不相同 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = arr.length - 2; i >= 1; i--) {
			if (arr[i] != arr[i - 1] && arr[i] == arr[i+1]) {
				arr[i+1] = arr[i+1]*2;
				
			} 
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}
	
	public static int[] test(int[] arr) {
		System.out.println("ddd");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		return null;
	}
}
