package LC;

import java.util.Arrays;

public class LC23�������Ԫ�����г��� {
	
	
	public int longestConsecutive (int[] num) {
		//1.����
		Arrays.sort(num);
		int maxLength = 1;
		int max = 1;
		//����
		for (int i = 0; i < num.length-1;i++) {
			if (num[i] == num[i+1]) { //�����i����ڵ�i+1�����ѭ��
				continue;
			}else if (num[i]==num[i+1]-1) { //����1��maxLength++
				maxLength++;
				if (max < maxLength) {
					max = maxLength;
				}
			}else { //����maxlength��1����������
				maxLength = 1;
			}
		}
		return max;
    }
	
}
