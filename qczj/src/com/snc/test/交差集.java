package com.snc.test;

import java.util.HashSet;
import java.util.Set;

public class ��� {
	public static void main(String[] args) {
		Set<String> result = new HashSet<String>();
        Set<String> set1 = new HashSet<String>() {
            {
                add("������ҫ");
                add("Ӣ������");
                add("��Խ����");
                add("���³�����ʿ");
            }   
        };

        Set<String> set2 = new HashSet<String>() {
            {
                add("������ҫ");
                add("���³�����ʿ");
                add("ħ������");
            }
        };

        result.clear();
        result.addAll(set1);
        result.retainAll(set2);
        System.out.println("������" + result);

        result.clear();
        result.addAll(set1);
        result.removeAll(set2);
        System.out.println("�1��" + result);
        
        result.clear();
        result.addAll(set2);
        result.removeAll(set1);
        System.out.println("�2��" + result);

        result.clear();
        result.addAll(set1);
        result.addAll(set2);
        System.out.println("������" + result);
	}
}
