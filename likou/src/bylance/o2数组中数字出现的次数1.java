package bylance;

public class o2���������ֳ��ֵĴ���1 {
	public static void main(String[] args) {
		System.out.println(0^1);
		System.out.println(0^6);
		

		int[] nums = { 4, 6, 2, 4 };

		singleNumbers(nums);

	}

	public static int[] singleNumbers(int[] nums) {

		// ���ڽ����е����������
		int k = 0;

		for (int num : nums) {
			k ^= num;
		}

		int mask = 1;

		while ((k & mask) == 0) {
			mask <<= 1;
		}

		//����ֻ����һ�ε���
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
