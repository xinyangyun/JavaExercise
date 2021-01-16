package JZ;

import java.util.PriorityQueue;
import java.util.Queue;

public class JZ63�������е���λ�� {

	Queue<Integer> A = new PriorityQueue<>(); // С���ѣ�����ϴ��һ��
	Queue<Integer> B = new PriorityQueue<>((x, y) -> (y - x));// �󶥶ѣ������С��һ��  //��������

	public void Insert(Integer num) {
		if (A.size() != B.size()) {
			A.add(num);
			B.add(A.poll()); //
		} else {
			B.add(num);
			A.add(B.poll());
		}
	}

	public Double GetMedian() {
		return A.size() != B.size() ? new Double(A.peek())  : new Double((A.peek() + B.peek()) / 2.0) ;
	}

}
