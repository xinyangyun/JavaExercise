package 常用STL练习题;

import java.util.Scanner;
import java.util.TreeSet;

public class 蒜头君学英语 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x;
		String s = new String();
		TreeSet<String> ts = new TreeSet<String>();
		for (int i = 0; i < n; i++) {
			x = sc.nextInt();
			s = sc.next();
			s = s.toUpperCase();
			if (x ==0) {
				ts.add(s);
			}else {
				if (ts.contains(s)) {
					System.out.println("YES");
				}else {
					System.out.println("NO");
				}
			}
		}
	}
}
