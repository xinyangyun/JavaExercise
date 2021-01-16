package algorithm;

import java.util.Arrays;
import java.util.Collections;

public class Ì°ÐÄËã·¨ {
	public static void main(String[] args) {
		Integer[] arr1 = {1,2,};
		Integer[] arr2 = {1,2,3};
		int test = findContentChildren(arr1, arr2);
		System.out.println(test);
		
	}

	public static int findContentChildren(Integer[] g, Integer[] s) {
		Arrays.sort(g,Collections.reverseOrder());
		Arrays.sort(s,Collections.reverseOrder());

		int si = 0, gi = 0;
		int res = 0;

		while (gi < g.length && si < s.length) {
			
			if (s[si] >= g[gi] ) {
				res++;
				si++;
				gi++;
			}else {
				gi++;
			}
			
		}
		
		return res;
	}
}
