package com.lianxi2;

import java.util.PriorityQueue;
import java.util.Queue;

public class o41 {

	Queue<Integer> A, B;

	public static void main(String[] args) {

	}

	public o41() {
		A = new PriorityQueue<>(); // С���ѣ�����ϴ��һ��  //��������
		B = new PriorityQueue<>((x, y) -> (y - x)); // �󶥶ѣ������С��һ��  //��������
	}

	public void addNum(int num) {
		if (A.size() != B.size()) {//����ȣ�����B�У��ȼ���A�У�Ȼ���A���ټ���B��
			A.add(num);
			B.add(A.poll());
		} else {  //
			B.add(num);
			A.add(B.poll());
		}
	}

	public double findMedian() {
		return A.size() != B.size() ? A.peek() : (A.peek() + B.peek()) / 2.0;//���A��B�ĳ��Ȳ���ȷ���A��ֵ�������ȷ���ƽ��ֵ
	}

}
