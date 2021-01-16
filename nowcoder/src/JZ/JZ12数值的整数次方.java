package JZ;

public class JZ12数值的整数次方 {

	public double Power(double base, int exponent) {

		double res = 1;
		for (int i = 0; i < Math.abs(exponent); i++) {
			res *= base;
		}

		if (exponent < 0) {
			res = 1 / res;
		}

		return res;
	}

}
