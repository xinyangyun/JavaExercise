package mianshi;

import java.util.Scanner;

//����ϣ��һ�������е�Ԫ���Ǹ�����ͬ�ģ������������ʵ�������в��ġ����ڸ���һ������A������
//������Щ��ͬ��Ԫ�أ������ṩ��һ�ֱ仯��ʽ��ʹ�þ������ɴβ�����һ�����Եõ�һ��Ԫ�ظ�����ͬ�����С�
//��������������ģ���xΪ��������С�����ظ������֣�����Ҫɾ������������һ��x�����ѵڶ���x�滻Ϊ2*x��
//����������յ����С�
//����ԭ������[2,2,1,1,1],һ�α任���Ϊ[2,2,2,1]�����α任���Ϊ[4,2,1]���任����
//5
//5 5 5 5 4
//20 4

public class ������ͬ {
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
