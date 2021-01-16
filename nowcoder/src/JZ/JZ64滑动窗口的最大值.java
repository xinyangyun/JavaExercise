package JZ;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class JZ64�������ڵ����ֵ {

	public ArrayList<Integer> maxInWindows(int[] num, int size) {
		
		ArrayList<Integer> res = new ArrayList<>();
		
		if (size > num.length) {
            return res;
        }
		
		if (num.length == 0 || size == 0) {
			return res;
		}
		
		Deque<Integer> deque = new LinkedList<>();
		
		for (int i = 0;i < size;i++) { //δ�γɴ���
			while (!deque.isEmpty() && num[i] > deque.peekLast()) {//�����ǰС�ڶ��е����һ����ɾ�����һ��
				deque.removeLast();
			}
			deque.addLast(num[i]);
		}
		
		res.add(deque.peekFirst()); //���еĵ�һ��ֵҲ������ֵ
		
		for (int i = size;i < num.length;i++) {
			if (deque.peekFirst() == num[i-size]) { //�����λ���ڵ�ǰֵ��˵����λ�Ѿ����ٵ�ǰ���ˣ���Ҫɾ��
				deque.removeFirst();
			}
			while (!deque.isEmpty() && num[i] > deque.peekLast()) {  //ɾ���ȵ�ǰֵС��ֵ
				deque.removeLast();
			}
			//�ѵ�ǰֵ��ӵ�������
			deque.addLast(num[i]);
			//�Ѷ��е���λ��ӵ�res��
			res.add(deque.peekFirst());
		}
		
		return res;
	}

}
