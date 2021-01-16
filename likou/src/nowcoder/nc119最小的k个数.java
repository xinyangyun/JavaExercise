package nowcoder;

import java.util.ArrayList;
import java.util.Arrays;

public class nc119最小的k个数 {

	public static void main(String[] args) {
		
		int[] arr = {4,5,1,6,2,7,3,8};
		int k = 10;
		
		ArrayList<Integer> result = GetLeastNumbers_Solution(arr, k);
		
		result.forEach(x -> {
			System.out.println(x);
		});
		
	}

	public static ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
		
		ArrayList<Integer> res = new ArrayList<>();
		Arrays.sort(input);
		
		for (int i = 0;i < k;i++) {
//			System.out.println(i);
			if ( i >= input.length) {
				return new ArrayList<>();
			}
			res.add(input[i]);
		}
		
		return res;
	}

}
