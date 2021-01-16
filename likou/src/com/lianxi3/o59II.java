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
		que = new LinkedList<>(); // ���У������ɾ��
		max = new LinkedList<>(); // ˫�˶��У���ȡ���ֵ
	}

	public int max_value() {
		return max.size() > 0 ? max.getFirst() : -1;// ˫�˶��еĶ���Ϊque�����ֵ
	}

	public void push_back(int value) {
		que.offer(value);// value���
		while (max.size() > 0 && max.getLast() < value) {//ע�⣺����ڶ����ж��������ܴ��Ⱥţ���max�ж��ڵ�
														//ǰqueue�еľ�����ֵͬ��Ԫ�ػ�ȫ���洢�������Ǵ洢������Ǹ���
			max.removeLast();// ��deq��βС��value��Ԫ��ɾ��
		}
		max.add(value);
	}

	public int pop_front() {
		int tmp = que.size() > 0 ? que.poll() : -1;// ��ö���Ԫ��
		if (max.size()>0 && max.peek().equals(tmp)) {
			max.removeFirst();//������ӵ�Ԫ���ǵ�ǰ���ֵ����deq�Ķ��׳���
		}
		return tmp;
	}

}
