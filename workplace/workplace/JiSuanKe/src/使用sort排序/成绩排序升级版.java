package Ê¹ÓÃsortÅÅĞò;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class ³É¼¨ÅÅĞòÉı¼¶°æ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student3 stu[] = new Student3[110];
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			stu[i] = new Student3();
			stu[i].name = sc.next();
			stu[i].yw = sc.nextInt();
			stu[i].sx = sc.nextInt();
			stu[i].yy = sc.nextInt();
			stu[i].kx = sc.nextInt();
		}
		Arrays.sort(stu,0,n,new cmp4());
		for (int i = 0; i < n; i++) {
			if (i!= n-1) {
				System.out.print(stu[i].name+" ");
			}else {
				System.out.println(stu[i].name);
			}
		}
	}
}

class Student3 {
	String name;
	int yw;
	int sx;
	int yy;
	int kx;
}

class cmp4 implements Comparator<Student3> {
	@Override
	public int compare(Student3 s1, Student3 s2) {
		return s2.yw-s1.yw;
	}
}