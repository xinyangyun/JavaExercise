package ����STL��ϰ��;

import java.util.Scanner;
import java.util.TreeSet;

public class ���㼯�ϵĲ� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		TreeSet<Integer> ts = new TreeSet<Integer>();
		for (int i = 0; i < n+m; i++) {
			ts.add(sc.nextInt());
		}
		int con = 0;
		for (Integer x : ts) {
			if (con!=ts.size()-1) {
				System.out.print(x+" ");
			}else {
				System.out.println(x);
			}
		}
	}
}
