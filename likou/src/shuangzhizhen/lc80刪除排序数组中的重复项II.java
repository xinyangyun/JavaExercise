package shuangzhizhen;

public class lc80�h�����������е��ظ���II {
	public static void main(String[] args) {
		
	}
	
	public int removeDuplicates(int[] nums) {
		
// 		if (nums == null || nums.length == 0) return 0;
// 		
// 		//1.ָ�붨��[0,index]���޸ĺ����ظ�������Ԫ�� ��ע�� �����Ѿ���0�����ȥ��
// 		int index = 0;
// 		//2.��һ��ѭ��ָ�룬��1��ʼ����ֹΪnums.length��Ϊʲô��1��ʼ����Ϊ����Ҫ�Ƚ��ظ�nums[0]�϶��ǲ��ظ���
// 		for (int i = 1;i < nums.length;i++) {
// 			//3.ָ���˶�������
// 			if (nums[index]!= nums[i]) {
// 				index++;
// 				nums[index] = nums[i];
// 			}
// 		}
//		//4.���ݶ���ȷ������ֵ
//		return index+1;
		
		int i = 0;
		for (int n : nums) {
			if (i < 2 || n > nums[i-2]) {
				nums[i++] = n;
			}
		}
		return i;
    }
}
