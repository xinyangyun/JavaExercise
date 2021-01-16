package bylance;

public class o2数组中数字出现的次数1 {
	public static void main(String[] args) {
		System.out.println(0^1);
		System.out.println(0^6);
		

		int[] nums = { 4, 6, 2, 4 };

		singleNumbers(nums);

	}

	public static int[] singleNumbers(int[] nums) {

		// 用于将所有的数异或起来
		int k = 0;

		for (int num : nums) {
			k ^= num;
		}

		int mask = 1;

		while ((k & mask) == 0) {
			mask <<= 1;
		}

		//两个只出现一次的数
		int a = 0,b = 0;
		
		for (int num : nums) {
			if ((num & mask) == 0) a ^= num;
			else {
				b ^= num;
			}
		}

		return new int[] {a,b};
	}
}
