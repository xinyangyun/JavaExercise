package com.lianxi3;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class o59II {
	Queue<Integer> que;
	Deque<Integer> max;

	public static void main(String[] args) {

	}

	public o59II() {
		que = new LinkedList<>(); // 队列：插入和删除
		max = new LinkedList<>(); // 双端队列：获取最大值
	}

	public int max_value() {
		return max.size() > 0 ? max.getFirst() : -1;// 双端队列的队首为que的最大值
	}

	public void push_back(int value) {
		que.offer(value);// value入队
		while (max.size() > 0 && max.getLast() < value) {//注意：这里第二个判断条件不能带等号，即max中对于当
														//前queue中的具有相同值的元素会全部存储，而不是存储最近的那个。
			max.removeLast();// 将deq队尾小于value的元素删除
		}
		max.add(value);
	}

	public int pop_front() {
		int tmp = que.size() > 0 ? que.poll() : -1;// 获得队首元素
		if (max.size()>0 && max.peek().equals(tmp)) {
			max.removeFirst();//如果出队的元素是当前最大值，将deq的队首出队
		}
		return tmp;
	}

}
