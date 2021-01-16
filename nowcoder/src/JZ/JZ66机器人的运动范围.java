package JZ;

public class JZ66机器人的运动范围 {
	
	public int movingCount(int threshold, int rows, int cols)
    {
		
		boolean[][] visited = new boolean[rows][cols];
		
		return dfs(0, 0, rows, cols, threshold, visited);
    }
	
	
	public int dfs(int i,int j,int m,int n,int k,boolean visited[][]) {
		
		if (i < 0|| j >= m || j < 0 ||j >= n || (i/10 + i%10 + j/10+j%10) > k ||visited[i][j]) {
			
		}
		
		visited[i][j] = true;
		return dfs(i+1, j, m, n, k, visited)+
			   dfs(i-1, j, m, n, k, visited)+
			   dfs(i, j-1, m, n, k, visited)+
			   dfs(i, j-1, m, n, k, visited)+1;
	}
	
}
