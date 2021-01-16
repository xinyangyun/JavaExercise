package LC2;

import java.util.ArrayList;

public class LC60¸ñÀ×Âë {
	
	public static void main(String[] args) {
		System.err.println(true && false);  
	}

	public ArrayList<Integer> grayCode(int n) {
		ArrayList<Integer> result = new ArrayList<>();
		if (n < 0)
			return result;
		if (n == 0) {
			result.add(0);
			return result;
		}
		result.add(0);
		result.add(1);
		for (int i = 2; i <= n; i++) {
			int size = result.size();
			for (int j = size - 1; j >= 0; j--) {
				result.add(result.get(j) + (1 << (i - 1)));
			}
		}
		return result;
	}

}
