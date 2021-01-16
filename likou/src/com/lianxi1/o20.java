package com.lianxi1;

import java.util.Scanner;

/*��ʵ��һ�����������ж��ַ����Ƿ��ʾ��ֵ������������С������
���磬�ַ���"+100"��"5e2"��"-123"��"3.1416"��"0123"����ʾ��ֵ��
��"12e"��"1a3.14"��"1.2.3"��"+-5"��"-1E-16"��"12e+5.4"�����ǡ�
*/

public class o20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(isNumber(sc.next()));
	}

	public static boolean isNumber(String s) {
		if (s == null || s.length() == 0) {
			return false;
		}
		// ����Ƿ�������ͬ���
		boolean numSeen = false;
		boolean dotSeen = false;
		boolean eSeen = false;

		char[] str = s.trim().toCharArray();

		for (int i = 0; i < str.length; i++) {
			if (str[i] >= '0' && str[i] <= '9') {
				numSeen = true;
			}else if (str[i] == '.') {
				//.֮ǰ���ܳ���.����e
				if (dotSeen || eSeen) {
					return false;
				}
				dotSeen = true;
			}else if (str[i] == 'e' || str[i] == 'E') {
				//e֮ǰ���ܳ���e�����������
				if(eSeen || !numSeen) {
					return false;
				}
				eSeen =true;
				numSeen = false;//����numSeen,�ų�123e����123e+�������ȷ��e֮��Ҳ������
			}else if (str[i] == '-' || str[i] == '+') {
				//+-������0λ�û���e/E�ĺ����һ��λ�ò��ǺϷ���
				if (i !=0 && str[i-1] != 'e' &&  str[i-1] != 'E') {
					return false;
				}
			}else {//�������Ϸ��ַ�
				return false;
			}
		}
		return numSeen;
	}
}
