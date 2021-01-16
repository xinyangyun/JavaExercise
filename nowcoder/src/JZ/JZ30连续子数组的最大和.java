package JZ;

public class JZ30连续子数组的最大和 {

	public int FindGreatestSumOfSubArray(int[] array) {

		int res = array[0];

		for (int i = 1; i < array.length; i++) {
			array[i] += Math.max(array[i - 1], 0);
			res = Math.max(res, array[i]);
		}

		return res;
	}

}
