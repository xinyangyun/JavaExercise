package JZ;

import java.util.PriorityQueue;
import java.util.Queue;

public class JZ63数据流中的中位数 {

	Queue<Integer> A = new PriorityQueue<>(); // 小顶堆，保存较大的一半
	Queue<Integer> B = new PriorityQueue<>((x, y) -> (y - x));// 大顶堆，保存较小的一半  //降序排列

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
