package shuzu;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;

public class lc873最长的斐波拉切子序列长度 {
	public static void main(String[] args) {
		int[] arr = { 1,2,3,4,5,6,7,8 };

		System.out.println(lenLongestFibSubseq(arr));
	}

	public static int lenLongestFibSubseq(int[] A) {

		int N = A.length;

		HashSet<Integer> S = new HashSet<>();

		for (Integer x : A) {
			S.add(x);
		}

		int ans = 0;
		for (int i = 0; i < A.length; i++) {
			for (int j = i+1; j < A.length; j++) {
				int x = A[j],y = A[i] + A[j];
				int length = 2;
				while (S.contains(y)) {
					int temp = y;
					y +=x;
					x = temp;
					ans = Math.max(ans, ++length);
				}
			}
		}

		return ans >= 3 ? ans:0;
	}

}
