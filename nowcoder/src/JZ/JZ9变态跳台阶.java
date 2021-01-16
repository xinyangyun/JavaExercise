package JZ;

public class JZ9变态跳台阶 {
	public static void main(String[] args) {

	}

	public int JumpFloorII(int target) {
		
		//0，1，2，4，8，16这个规律
		
		if (target <= 0) return 0;
		
		else return (int) Math.pow(2, target-1);
	}
}
