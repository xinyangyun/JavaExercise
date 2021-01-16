package hashmap;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class P1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); 
		int k = sc.nextInt(); 
		int[] s = new int[1005]; 
		char[] m = new char[1005];
		int[] score = new int[k];
		int k1 = k;
		Stu[] stus = new Stu[n];

		int[][] every = new int[k][k];
		for (int i = 0; i < n; i++) {
			s[i] = sc.nextInt();
			m[i] = sc.next().charAt(0);
		}
		for (int i = 0; i < k; i++) {
			for (int j = 0; j < k; j++) {
				every[i][j] = sc.nextInt();
				score[j] += every[i][j];
			}
		}

		for (int i = 0; i < n; i++) {
			int num = m[i] - 'A'; 
			int sum = score[num];
			double avg = sum * 1.0 / k; 

			for (int i1 = 0; i1 < k; i1++) {
				if (Math.abs(every[i1][num] - avg) > 15) {
					sum -= every[i1][num];
					k1--;
				}
			}
			avg = Math.round(sum * 1.0 / k1);
			k1 = k;
			int ans = (int) Math.round(s[i] * 0.6 + 0.4 * avg);

			stus[i] = new Stu(ans, String.valueOf(m[i]));
		}

		Arrays.sort(stus, 0, n, new cmp_sc());
		for (Stu student : stus) {
			System.out.println(student.sum + " " + student.ch);
		}

	}

}

class Stu {
	int sum; 
	String ch; 

	public Stu(int sum, String ch) {
		this.sum = sum;
		this.ch = ch;
	}

}

class cmp_sc implements Comparator<Stu> {
	public int compare(Stu a, Stu b) {
		if (a.sum == b.sum) {
			return a.ch.compareTo(b.ch);
		}
		return b.sum - a.sum;
	}
}



