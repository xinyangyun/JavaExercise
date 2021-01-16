package mianshi;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

//杰夫非常喜欢种草，他自己有一片草地，为了方便起见，我们把这片草地看成一行从左到右，并且第 i 个位置的草的高度是hi。
//杰夫在商店中购买了m瓶魔法药剂，每瓶魔法药剂可以让一株草长高x，杰夫希望每次都能有针对性的使用药剂，
//也就是让当前长得最矮的小草尽量高，现在杰夫想请你告诉他在使用了m瓶魔法药剂之后，最矮的小草在这种情况下最高能到多少。
public class 种草 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int x = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		int s = 0;
		for (int i = 0; i < m; i++) {
			while (arr[i] < arr[i+1] && s < m) {
				arr[i]+=x;
				s++;
			}
		}
		Arrays.sort(arr);
		System.out.println(arr[0]);
	}
}
