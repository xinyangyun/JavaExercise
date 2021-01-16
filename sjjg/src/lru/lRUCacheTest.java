package lru;

public class lRUCacheTest {
	public static void main(String[] args) throws Exception {
		System.out.println("start...");

		lruCache1();

		System.out.println("over...");
	}

	static void lruCache1() {
		System.out.println();
		System.out.println("===========================LRU ¡¥±Ì µœ÷===========================");
		LRUCache1<Integer, String> lru = new LRUCache1(5);
		lru.put(1, "11");
		lru.put(2, "11");
		lru.put(3, "11");
		lru.put(4, "11");
		lru.put(5, "11");
		System.out.println(lru.toString());
		lru.put(6, "66");
		lru.get(2);
		lru.put(7, "77");
		lru.get(4);
		System.out.println(lru.toString());
		System.out.println();
	}
}
