package com.lianxi3;

public class o58 {
	public static void main(String[] args) {
		String s = "  444 ";
		System.out.println(s.trim());
		
		String reverseWords = reverseWords("a good   example");
		System.out.println(reverseWords);
	}

	public static String reverseWords(String s) {

		String[] strs = s.trim().split(" ");//ɾ����λ�ո񣬷ָ��ַ���
		StringBuilder res = new StringBuilder();
		for (int i = strs.length-1; i >= 0; i--) {
			if (strs[i].equals("")) continue;//�����ո�������
			res.append(strs[i]+ " ");//������ƴ����StringBuiler
		}
		
		return res.toString().trim();//��stringbuilderת��Ϊ�ַ�����ɾ��β���ո񣬲�����
	}
}
