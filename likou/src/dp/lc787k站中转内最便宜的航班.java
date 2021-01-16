package dp;

import java.util.Arrays;

public class lc787kվ��ת������˵ĺ��� {
	public static void main(String[] args) {

	}

	public int findCheapestPrice(int n, int[][] flights, int src, int dst, int K) {

		// dp[i][k]�Ǿ�����k����תվ�󵽴�i����С����
		int[][] dp = new int[n][K + 1];

		// ѭ����ʼ��������ά����
		for (int i = 0; i < n; i++)
			Arrays.fill(dp[i], Integer.MAX_VALUE);

		// ����flights�е���Ϣ��ʼ��src��ֱ��İ��
		for (int[] flight : flights) {
			if (flight[0] == src) {
				dp[flight[1]][0] = flight[2];
			}
		}

		// ѭ����ʼ�������е�dst ==src����
		for (int i = 0; i <= K; i++) {
			dp[src][i] = 0;
		}

		// ��̬�滮״̬ת�Ʒ��̣���ʼ���
		// ֱ����Ѿ���ʼ������k=0������������ڴ�k=1��ʼ����ֻ��һ����תվ��ʼ
		for (int k = 1; k <= K; k++) {
			for (int[] flight : flights) {
				// �����Ŀ���
				if (dp[flight[0]][k - 1] != Integer.MAX_VALUE) {
					dp[flight[1]][k] = Math.min(dp[flight[1]][k], dp[flight[0]][k - 1] + flight[2]);
				}
			}
		}

		return dp[dst][K] == Integer.MAX_VALUE ? -1 : dp[dst][K];
	}
}
