package LC;

public class LC17����վ {

	// ������ֻ��һ��������ֻ�д����start������
	// �ſ�������ȫ�̡���Ҳָ����һ����ʵ���Ǿ���
	// ����������������ߵ�start-1ʱ�޷�����һ��
	// ��start�����Ե����ֱ���ʣ��������<0ʱ����һ��
	// ���п�������������㣬�����ǲ��ǣ�Ҫ���ܵ�����
	// ���ǲ��Ǵ���0
	public int canCompleteCircuit(int[] gas, int[] cost) {

		if (gas == null || cost == null || gas.length <= 0 || cost.length <= 0) {
			return -1;
		}

		int index = -1, remain = 0, total = 0;

		for (int i = 0; i < gas.length; i++) {
			total += gas[i] - cost[i]; //��¼�Ƿ��������
			remain += gas[i] - cost[i]; //�ҵ����λ��
			// �������ʣ��< 0,˵��������i�ߵ�i+1
			if (remain < 0) {
				remain = 0;
				index = i;
			}
		}

		return total >= 0 ? index + 1 : -1;
	}

}
