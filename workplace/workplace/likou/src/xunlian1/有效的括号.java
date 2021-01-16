package xunlian1;

import java.util.Scanner;
import java.util.Stack;

public class ÓÐÐ§µÄÀ¨ºÅ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(juge(str));
	}
	
	static boolean juge(String s) {
		if (s.isEmpty()) {
			return true;
		}
		char[] ch = s.toCharArray();
		Stack<Character> stack = new Stack<Character>();
		for(char c : ch) {
			if (c == '(') {
				stack.push(')');
			}else if (c == '{') {
				stack.push('}');
			}else if (c == '[') {
				stack.push(']');
			}else if (stack.empty() || c!= stack.pop()) {
				return false;
			}
		}
		if (stack.empty()) {
			return true;
		}
		return false;
	}
}
