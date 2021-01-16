package generic;

public class genericTest {
	public static void main(String[] args) {
		
	}
	
	public static <E> void printArray(E[] inputArray) {
		for (E e : inputArray) {
			System.out.printf("%s",e);
		}
	}
}
