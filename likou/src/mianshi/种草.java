package mianshi;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

//�ܷ�ǳ�ϲ���ֲݣ����Լ���һƬ�ݵأ�Ϊ�˷�����������ǰ���Ƭ�ݵؿ���һ�д����ң����ҵ� i ��λ�õĲݵĸ߶���hi��
//�ܷ����̵��й�����mƿħ��ҩ����ÿƿħ��ҩ��������һ��ݳ���x���ܷ�ϣ��ÿ�ζ���������Ե�ʹ��ҩ����
//Ҳ�����õ�ǰ�������С�ݾ����ߣ����ڽܷ��������������ʹ����mƿħ��ҩ��֮�����С�����������������ܵ����١�
public class �ֲ� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int x = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		int s = 0;
		for (int i = 0; i < m; i++) {
			while (arr[i] < arr[i+1] && s < m) {
				arr[i]+=x;
				s++;
			}
		}
		Arrays.sort(arr);
		System.out.println(arr[0]);
	}
}
