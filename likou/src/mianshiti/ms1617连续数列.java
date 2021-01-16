package mianshiti;

public class ms1617连续数列 {
	public static void main(String[] args) {

	}

	public int maxSubArray(int[] nums) {

		int res = nums[0];
		int sum = 0;
		for (int num : nums) {
			if (sum < 0) {
				sum = num;
			}else {
				sum +=num;
			}
			res = Math.max(res, sum);
		}
		return res;
	}
}
