package com.lianxi2;

import java.util.PriorityQueue;
import java.util.Queue;

public class o41 {

	Queue<Integer> A, B;

	public static void main(String[] args) {

	}

	public o41() {
		A = new PriorityQueue<>(); // 小顶堆，保存较大的一半  //升序排列
		B = new PriorityQueue<>((x, y) -> (y - x)); // 大顶堆，保存较小的一半  //降序排列
	}

	public void addNum(int num) {
		if (A.size() != B.size()) {//不相等，加入B中，先加入A中，然后从A中再加入B中
			A.add(num);
			B.add(A.poll());
		} else {  //
			B.add(num);
			A.add(B.poll());
		}
	}

	public double findMedian() {
		return A.size() != B.size() ? A.peek() : (A.peek() + B.peek()) / 2.0;//如果A和B的长度不相等返回A的值，如果相等返回平均值
	}

}
