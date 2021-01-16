package 栈和递归练习题;

import java.util.Scanner;
import java.util.Stack;

public class 网页调转 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Stack<String> s1 = new Stack<String>();
		Stack<String> s2 = new Stack<String>();
		char[] c = new char[105];
		for (int i = 0; i < n; i++) {
			String s = sc.next();
			if (s.equals("VISIT")) {
				String sw = sc.next();
				s2.clear();
				s1.push(sw);
			}else if (s.equals("BACK")){
				if (s1.size()<=1) {
					System.out.println("Ignore");
					continue;
				}
				s2.push(s1.peek());
				s1.pop();
			}else {  //前进
				if (s2.empty()) {
					System.out.println("Ignore");
					continue;
				}
				s1.push(s2.peek());
				s2.pop();
			}
			System.out.println(s1.peek());
		}
	}
}
