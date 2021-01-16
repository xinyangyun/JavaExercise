package bylance;

import java.util.HashMap;
import java.util.Map;

public class o3数组中数字出现的次数II {
	public static void main(String[] args) {

	}

	public int singleNumber(int[] nums) {

		HashMap<Integer, Integer> result = new HashMap<>();

		for (int e : nums) {
			int count = result.getOrDefault(e, 0) + 1;
			result.put(e, count);
		}
		
		for (Map.Entry<Integer, Integer> entry : result.entrySet()) {
			if (entry.getValue() == 1) {
				return entry.getKey();
			}
		}

		return 0;
	}
}
