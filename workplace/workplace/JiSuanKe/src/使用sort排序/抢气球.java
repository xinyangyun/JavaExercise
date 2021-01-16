package 使用sort排序;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class 抢气球 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		kid[] kids = new kid[1005];
		int[] h = new int[1005];
		for (int i = 0; i < n; i++) {
			kids[i] = new kid();
			kids[i].high = sc.nextInt();
			kids[i].num = i +1;
		}
		for (int i = 0; i < m; i++) {
			h[i] = sc.nextInt();
		}
		Arrays.sort(kids, 0, n, new cmp5());
		Arrays.sort(h, 0, m);
		
		int p=0;
		for(int i=0;i<n;i++) {
			while(p<m && kids[i].high>=h[p]) {       //将气球的高度排序过后有一个节点，当前面的气球摘了过后，p++,就不用再查找前面的
				kids[i].sum++;
				p++;
			}
		}
		
//		for (int i = 0; i < n; i++) {
//			for (int j = 0; j < m; j++) {
//				if (h[j] != 0) {
//					if (kids[i].high >= h[j]) {
//						kids[i].sum++;
//						h[j] = 0;
//					}
//				}
//			}
//		}
		Arrays.sort(kids, 0, n, new cmp6());
		for (int i = 0; i < n; i++) {
			System.out.println(kids[i].sum);
		}
		

	}
}

class kid {
	int high;
	int num;
	int sum = 0;
}

class cmp5 implements Comparator<kid> {

	@Override
	public int compare(kid k1, kid k2) {
		return k1.high - k2.high;
	}
}

class cmp6 implements Comparator<kid> {

	@Override
	public int compare(kid k1, kid k2) {
		return k1.num - k2.num;
	}
}
