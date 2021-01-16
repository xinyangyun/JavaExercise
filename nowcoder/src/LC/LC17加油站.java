package LC;

public class LC17加油站 {

	// 解有且只有一个，所以只有从起点start处出发
	// 才可以走完全程。这也指出了一个事实：那就是
	// 从另外的起点出发，走到start-1时无法走下一步
	// 到start，所以当出现本次剩余汽油量<0时，下一步
	// 就有可能是真正的起点，至于是不是，要看总得汽油
	// 量是不是大于0
	public int canCompleteCircuit(int[] gas, int[] cost) {

		if (gas == null || cost == null || gas.length <= 0 || cost.length <= 0) {
			return -1;
		}

		int index = -1, remain = 0, total = 0;

		for (int i = 0; i < gas.length; i++) {
			total += gas[i] - cost[i]; //记录是否可以走完
			remain += gas[i] - cost[i]; //找到起点位置
			// 如果本次剩余< 0,说明不能由i走到i+1
			if (remain < 0) {
				remain = 0;
				index = i;
			}
		}

		return total >= 0 ? index + 1 : -1;
	}

}
