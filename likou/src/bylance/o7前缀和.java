package bylance;

import java.util.Scanner;

public class o7ǰ׺�� {

	static int[] pre = new int[1000005];

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			int num = sc.nextInt();
			pre[i] = pre[i - 1] + num;   //�����0��i�ĺ�
		}

		int[] arr = new int[m];
		
		for (int i = 0; i < m; i++) {
			int l = sc.nextInt();
			int r = sc.nextInt();
//			System.out.println(pre[r] - pre[l - 1]);  //r���ܺ� ��ȥ l-1���ܺ;���l ��r���ܺ�
			arr[i] = pre[r] - pre[l - 1];
		}
		
		for (int i = 0;i < arr.length;i++) {
			System.out.println(arr[i]);
		}

	}

}
