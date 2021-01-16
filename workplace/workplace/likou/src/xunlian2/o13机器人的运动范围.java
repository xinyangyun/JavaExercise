package xunlian2;

public class o13机器人的运动范围 {
	
	static int sum1 = 0,row,col;
	static boolean[][] vis;
	
	public static void main(String[] args) {
		System.out.println(movingCount(2, 3,1));
	}
	
	public static int movingCount(int m, int n, int k) {
		vis = new boolean[m][n];
		row = m;
		col = n;
		
		return dfs(0, 0, k);
    }
	
	public static int dfs(int m,int n,int k) {
		if (m >= row || n >= col || vis[m][n] || sum(m, n) > k ) {
			return 0;
		}
		vis[m][n] = true;
		return 1 + dfs(m+1, n, k) + dfs(m,n+1,k);
	}
	
	public static int sum(int m,int n) {
		int sum = 0;
		while (m > 0) {
			sum += m%10;
			m/=10;
		}
		while (n > 0) {
			sum += n%10;
			n/=10;
		}
		return sum;
	}
}
