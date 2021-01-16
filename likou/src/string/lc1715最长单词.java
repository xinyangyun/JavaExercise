package string;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class lc1715×î³¤µ¥´Ê {
	public static void main(String[] args) {
		String str = "fdfdfdf";
		System.out.println(str.substring(5)); 
	}

	public String longestWord(String[] words) {

		Arrays.sort(words, (o1, o2) -> {
			if (o1.length() == o2.length()) {
				return o1.compareTo(o2);
			} else {
				return Integer.compare(o2.length(), o1.length());
			}
		});
		
		HashSet<String> set = new HashSet<>(Arrays.asList(words));

		for (String word : words) {
			set.remove(word);
			if (find(set, word)) {
				return word;
			}
		}
		
		return "";
	}
	
	public boolean find(Set<String> set,String word) {
		
		if (word.length()==0) {
			return true;
		}
		
		for (int i = 0; i < word.length(); i++) {
			if (set.contains(word.substring(0,i+1)) && find(set, word.substring(i+1))) {
				return true;
			}
		}
		
		return false;
	}
	
}
