package hashmap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long sumO = 0;
		int sum = sc.nextInt();
		int[] arr = new int[sum];
		int px = 1;
		HashMap<Integer, Integer>  map = new HashMap<>();
		HashSet<Integer> set =new HashSet<Integer>();
		for (int i = 0; i < sum; i++) {
			arr[i] = sc.nextInt();
		}
		for (int j = 0; j < arr.length; j++) {
			set.add(arr[j]);
		}
		for (Integer int1 : set) {
			map.put(int1,px++ );
		}
		
		for (int i = 0; i < sum; i++) {
//			sumO+=arr[i]-arr[0]+1;
			sumO+=map.get(arr[i]);
		}
		
		System.out.println(sumO);
	}
}
