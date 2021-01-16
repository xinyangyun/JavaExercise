package tanxin;

public class lc1217Íæ³ïÂë {
	public static void main(String[] args) {
		
	}
	
	public int minCostToMoveChips(int[] position) {
		
		int odd = 0,even = 0;
		
		for (int i = 0; i < position.length; i++) {
			if (position[i] %2 == 0) {
				odd++;
			}else {
				even++;
			}
		}
		
		return Math.min(odd, even);  
    }
}
