package mianshi;

public class 最大数组和 {
	public static void main(String[] args) {
		int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
		int maxSubArray = maxSubArray(arr);
		System.out.println(maxSubArray);
	}
	
	static int maxSubArray(int[] nums) {
		int sum = 0;
		int max = Integer.MIN_VALUE;
		
		for (int num : nums) {
			if (sum < 0 ) {
				sum = num;
			}else {
				sum += num;
			}
			max = Math.max(max, sum);
		}
		return max;
	}
}
