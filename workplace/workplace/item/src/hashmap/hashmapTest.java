package hashmap;

import java.util.HashMap;

public class hashmapTest {
	public static void main(String[] args) {
		
		//为什么hashmap的数组长度是2的n次方幂，因为是为了解决hash冲突
		//如果hashmap初始化数组长度为10，那么hashmap会变成什么？
		//边界值会自动变成长度为16，主要是按位或运算，无符号右移 变为比指定容量大的最小的2的n次幂
//		  int n = cap - 1;
//	        n |= n >>> 1;
//	        n |= n >>> 2;
//	        n |= n >>> 4;
//	        n |= n >>> 8;
//	        n |= n >>> 16;
//	        return (n < 0) ? 1 : (n >= MAXIMUM_CAPACITY) ? MAXIMUM_CAPACITY : n + 1;
		
		
		//一般扩容不是达到16再扩容而是12,16x负载因子（0.75）=12 
		
		//集合的最大容量2的30次方
		
		//为什么小与8就变为链表了，不是更小
		
		//根据泊松分布分析第8个链表的值的可能性非常小，所以后面就变为了红黑树，如果小于8就变成了红黑树又2太浪费内存
		//这是为了时间和空间的权衡，其实并不是想转红黑树
		
		//负载因子为什么是0.75？
		//太小浪费空间，太大又装的太满
		
		//边界值是在put方法中，jdk1.8后都是在put方法中，将边界值复制给cap然后x负载因子
		
		
		//put方法分析
		//hashmap中key可以为null，hashtable中不可以。
		//hashmap中计算索引值为按位，与，异或的用法，先计算出hash值，然后对hash值取余
		
		HashMap<Integer,String> hashMap = new HashMap<>();
		hashMap.put(1, "test");
		System.out.println(hashMap.get(1));
		
		
	} 
}
