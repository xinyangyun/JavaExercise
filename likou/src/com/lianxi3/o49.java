package com.lianxi3;

public class o49 {
	public static void main(String[] args) {
		
	}
	
	public int nthUglyNumber(int n) {
//		1 2 3 5 // ��һ����, 2,3,5�ֱ���1�������˻�
//		2 4 6 10 // ͬ��, 4,6,10��2�������˻�
//		3 6 9 15 // ....
//		4 8 12 20

		//������Ĵ��������ǿ��Կ����кܶ��ظ��ģ�����������Ҫ�ų���Щ�ظ���Ȼ���¼ÿһ������
		int a = 0,b = 0,c = 0;
		int[] dp = new int[n];
		
		dp[0] = 1;  //��һ������
		
		for (int i = 1; i < n; i++) {  //i��ʾ��i������
			int n2 = dp[a] * 2;//��ʾ����Ϊ2
			int n3 = dp[b] * 3;//��ʾ����Ϊ3
			int n5 = dp[c] * 5;//��ʾ����Ϊ5
			dp[i] = Math.min(Math.min(n2, n3), n5);//����������ȡ��С��һ��
			if (dp[i] == n2) a++;
			if (dp[i] == n3) b++;
			if (dp[i] == n5) c++;
		}
		
		return dp[n-1];
    }
	
}
