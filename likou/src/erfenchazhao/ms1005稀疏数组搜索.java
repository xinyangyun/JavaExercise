package erfenchazhao;

public class ms1005稀疏数组搜索 {
	public static void main(String[] args) {
		
	}
	
	public int findString(String[] words, String s) {
		
		int left = 0,right = words.length;
		
		while (left < right) {
			int mid = left + (right- left) /2;
			if (words[mid].equals("")&&!words[left].equals(s)) {
				left++;
				continue;
			}else if (words[left].equals(s)) {
				return left;
			}
			
			if (words[mid].equals(s)) {
				return mid;
			}else if (words[mid].compareTo(s)>0) { //mid在s的后面
				right = mid;
			}else if (words[mid].compareTo(s)<0) { //mid在s的前面
				left = mid+1;
			}
		}
		
		return -1;
    }
}
