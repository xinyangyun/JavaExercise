package 快速提升代码能力;

import java.util.Scanner;

public class 机器人 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] dx = { 1, 0, -1, 0 };
		int[] dy = { 0, -1, 0, 1 };
		int d = 0;
		int x0 = 0;
		int y0 = 0;
		while (n-- != 0) {
			String st = sc.next();
			int x = sc.nextInt();
			if (st.charAt(0) == 'r') {
				d += 1;
				d %= 4;
			} else if (st.charAt(0) == 'b') {
				d += 2;
				d %= 4;
			} else if (st.charAt(0) == 'l') {
				d += 3;
				d %= 4;
			} else {
				d %= 4;
			}
			x0 += dx[d] * x;
			y0  += dy[d] * x;
		}
		System.out.println(x0 +"  "+ y0);
	}
}
