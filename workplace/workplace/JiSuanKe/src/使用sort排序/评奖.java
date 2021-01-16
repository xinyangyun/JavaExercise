package  π”√sort≈≈–Ú;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


public class ∆¿Ω± {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student stu[] = new Student[45];
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			stu[i] = new Student();
			stu[i].name = sc.next();
			for (int j = 0; j < 4; j++) {
				stu[i].score[j] = sc.nextInt();
			}
		}
		Arrays.sort(stu,0,n,new cmp2());
		for (int i = 0; i < 3; i++) {
			System.out.printf("%s\n",stu[i].name);
		}
	}
	
}


class Student {
	String name;
	int[] score =new int[4];
}

class cmp2 implements Comparator<Student> {

	@Override
	public int compare(Student stu1, Student stu2) {
		int sum=0;
		for (int i = 0;i < 4;i++) {
			sum += stu2.score[i] - stu1.score[i];
		}
		return sum;
	}
}



