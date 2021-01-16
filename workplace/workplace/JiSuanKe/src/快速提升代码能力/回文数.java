package 快速提升代码能力;

import java.util.Scanner;

public class 回文数 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		int[] s = new int[100];
		s[sum++] = n;
		while(!judge(n)) {
			n+=rve(n);
			s[sum++] = n;
		}
		System.out.println(sum-1);
		for (int i = 0; i < sum; i++) {
			if(i!=sum-1) {
				System.out.print(s[i]+"--->");
			}else {
				System.out.println(s[i]);
			}
		}
	}
	
	public static boolean judge(int n) {
		int con = 0;
		int sum = 0;
		int[] c = new int[1005];
		while(n!=0) {
			c[con++] = n%10;
			n/=10;
		}
		for (int i = 0; i < con/2; i++) {
			if(c[i] != c[con-i-1]) {
				return false;
			}
		}
		return true;
	}
	
	public static int rve(int n ) {
		int ret = 0;
		while(n!=0) {
			ret = ret*10 +n%10;
			n /=10;
		}
		return ret;
	}
}
