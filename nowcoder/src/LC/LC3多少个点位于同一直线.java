package LC;

public class LC3多少个点位于同一直线 {

	public int maxPoints(Point[] points) {
		
		if (points == null) {
			return 0;
		}
		
		int size = points.length;
		
		if (size <= 0) {
			return 0;
		}
		
		if (size == 1) {
			return 1;
		}
		
		if (size == 2) {
			return 2;
		}
		
		int eqNum = 1;
		
		for (int m = 1; m < points.length;++m) {
			if (points[0].x == points[m].x && points[0].y == points[m].y) { //所有点都在同一个点
				++eqNum;
			}
		}
		
		if (eqNum == points.length) {
			return points.length;
		}
		
		int max = -1;
		
		for (int i = 0; i < size -1;i++) {
			Point p1 = points[i];
			for (int j = i+1;j < size;j++) {
				Point p2 = points[j];
				if (p1.x == p2.x && p1.y == p2.y) {
					continue;
				}
				
				int A = p2.x - p1.x;
				int B = p2.y - p2.y;
				int C = A * p1.y - B * p1.x;
				
				int len = 2;
				
				for (int k = 0;k < size;k++) {
					if (k == i||k ==j) {
						continue;
					}
					
					Point ph = points[k];
					
					if (A * ph.y == B * ph.x +C) {
						len++;
					}
					
					if (len > max) {
						max = len;
					}
				}
			}
		}
		
		return max;
	}

}

class Point {
	int x;
	int y;
}
