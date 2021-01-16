package shuzu;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class lc1027��Ȳ����� {
	public static void main(String[] args) {
		String str = "/fdsffs/gff/gf";
		
		Set<String> set = new HashSet<>(Arrays.asList(str.split("/")));
		
		
		
		
		Stream<String> filter = set.stream().filter(s -> s.length()>0);  
		
		filter.forEach(x->{
			if (x!="") {
				System.out.println(x);
			}
		});
		
		
		
//		System.out.println(str.substring(1, str.length()));  
	}
	
	public int longestArithSeqLength(int[] A) {
		
		HashMap<Integer, Integer>[] dp = new HashMap[A.length];
		
		for (int i = 0; i < dp.length; i++) {
			dp[i] = new HashMap<>();
		}
		
		int res = 1;
		
		//key����ǲ�ֵ
		
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < i; j++) {
				int diff = A[i] - A[j];
				if (!dp[j].containsKey(diff)) { //�����ֵ�����ڣ����´��룬����Ϊ2
					dp[i].put(diff, 2);
				}else {
					dp[i].put(diff, dp[j].get(diff)+1); //������ھ�+1
				}
				res = Math.max(res, dp[i].get(diff));
			}
		}
		
		return res;
    }
	
	
}
