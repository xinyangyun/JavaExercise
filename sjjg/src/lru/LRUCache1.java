package lru;

import java.util.HashMap;

public class LRUCache1<K,V> {
	
	private final int MAX_CACHE_SIZE;
	private Entry first;
	private Entry last;
	
	private HashMap<K,Entry<K,V>> hashMap;
	
	public LRUCache1(int cacheSize) {
		MAX_CACHE_SIZE = cacheSize;
		hashMap = new HashMap<K,Entry<K,V>>();
	}
	
	public void put(K key,V value) {
		Entry entry = getEntry(key);
		
		if (entry == null) {  //原来的缓存中没有
			if (hashMap.size() >= MAX_CACHE_SIZE) {
				hashMap.remove(last.key);//删除掉最后一个
				removeLast();
			}
			entry = new Entry();
			entry.key = key;
		}
		entry.value = value;
		moveToFirst(entry);
		hashMap.put(key, entry);
	}
	
	public V get(K key) {
		Entry<K,V> entry= getEntry(key);
		if (entry == null) return null;
		moveToFirst(entry);
		return entry.value;
	}
	
	public void remove(K key) {
		Entry entry = getEntry(key);
		if (entry!=null) {
			if (entry.pre!=null) entry.pre.next = entry.next;
			if (entry.next != null) entry.next.pre = entry.pre;
			if (entry == first) first = entry.next;
			if (entry == last) last = entry.pre;
		}
		hashMap.remove(key);
	}
	
	
	private void moveToFirst(Entry entry) { //移动到第一个
		//entry为第一个时
		if (entry == first) return;  
		//entry为第二个时
		if (entry.pre != null) entry.pre.next = entry.next;
		if (entry.next != null) entry.next.pre = entry.pre;
		//entry为最后一个时
		if (entry == last) last = last.pre;
		
		//当缓存中没有数据时
		if (first == null || last == null) {
			first = last = entry;
			return;
		}
		
		entry.next = first;
		first.pre = entry;
		first = entry;
		entry.pre = null;
	}
	
	private void removeLast() {  //删掉最后一个
		if (last!=null) {
			last = last.pre;
			if (last == null) first = null;//说明缓存中此时一个都没有
			else last.next = null;
		}
	}
	
	private Entry<K,V> getEntry(K key) {
		return hashMap.get(key);
	}
	
	@Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Entry entry = first;
        while (entry != null) {
            sb.append(String.format("%s:%s ", entry.key, entry.value));
            entry = entry.next;
        }
        return sb.toString();
    }
	
	class Entry<K,V> {
		public Entry pre;
		public Entry next;
		public K key;
		public V value;
	}
	
}
