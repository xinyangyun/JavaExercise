package ’ª∫Õµ›πÈ¡∑œ∞Ã‚;

import java.util.Scanner;

public class µØµØª… {
	static int n;
	static int[] a,b;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		a = new int[205];
		b = new int[205];
		for (int i = 1; i <= n; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 1; i <= n; i++) {
			b[i] = sc.nextInt(); 
		}
		System.out.println(ff(1));
	}
	
	static int ff(int x) {
		if (x > n) {
			return 0;
		}
		return Math.min(ff(x+a[x]),ff(x+b[x]))+1;
	}
}
