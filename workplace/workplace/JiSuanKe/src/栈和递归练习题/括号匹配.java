package ’ª∫Õµ›πÈ¡∑œ∞Ã‚;

import java.util.Scanner;
import java.util.Stack;

public class ¿®∫≈∆•≈‰ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char[] ch = str.toCharArray();
		Stack<Integer> stack = new Stack<Integer>();
		int[] arr = new int[50005];
		boolean f = true;
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == '(') {
				stack.push(i + 1);
			} else {
				if (!stack.isEmpty()) {
					arr[i + 1] = stack.peek();
					stack.pop();
				} else {
					f = false;
					break;
				}
			}
		}
		if (!stack.isEmpty()) {
			f = false;
		}
		if (!f) {
			System.out.println("NO");
		} else {
			System.out.println("YES");
			for (int i = 1; i <= ch.length; i++) {
				if (arr[i] != 0) {
					System.out.println(arr[i] + " " + i);
				}
			}
		}
	}
}
