package  π”√sort≈≈–Ú;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class ≥…º®≈≈–Ú {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student2 stu[] = new Student2[110];
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			stu[i] = new Student2();
			stu[i].num = i+1;
			stu[i].score = sc.nextInt();
		}
		Arrays.sort(stu,0,n,new cmp3());
		for (int i = 0; i < n; i++) {
			if ( i!= n-1) {
				System.out.print(stu[i].num+" ");
			}else {
				System.out.println(stu[i].num);
			}
		}
	}
}

class Student2{
	int num;
	int score;
}

class cmp3 implements Comparator<Student2> {

	@Override
	public int compare(Student2 stu1, Student2 stu2) {
		return stu2.score - stu1.score;
	}
}
