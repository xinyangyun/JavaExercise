package JZ;

public class JZ49把字符串转换成整数 {

	public int StrToInt(String str) {

		char[] c = str.trim().toCharArray();

		if (c.length == 0)
			return 0;

		int res = 0, bndry = Integer.MAX_VALUE / 10;

		int i = 1, sign = 1; // sign记录为正还是负数，默认为正数

		if (c[0] == '-')
			sign = -1;
		else if (c[0] != '+')
			i = 0;
		for (int j = i; j < c.length; j++) {
			if ((c[j] < '0') || c[j] > '9')
				break; // 如果不是数字则结束

			if (res > bndry || res == bndry && c[j] > '7') { // 数字越界
				return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
			}
			res = res * 10 + (c[j] - '0');
		}

		return sign * res;
	}

}
