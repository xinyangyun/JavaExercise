package LC;

import java.util.HashMap;
import java.util.Map;

public class LC14第一次出现的数字 {

	public int singleNumber(int[] A) {
		
//		int k = 0;
//		
//		for (int num : A) {
//			k ^= num;
//		}
//		
//		int mask = 1;
//		
//		while ((k & mask) ==0) {
//			mask <<= 1;
//		}
//		
//		//出现一次的数
//		int a = 0;
//		
//		for (int num : A ) {
//			if ((num & mask)==0) a ^= num;
//		}
//		
//		return a;
		
		HashMap<Integer, Integer> result = new HashMap<>();
		 
		for (int num : A) {
			int count = result.getOrDefault(num, 0)+1;
			result.put(num, count);
		}
		
		for (Map.Entry<Integer, Integer> entry : result.entrySet()) {
			if (entry.getValue() == 1) {
				return entry.getKey();
			}
		}
 		
		return 0;
	}
	

}
