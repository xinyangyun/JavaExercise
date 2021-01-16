package ImmutableList;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class ImmutableXXX {

	public static void main(String[] args) {
//		AtomicBoolean atomicBoolean = new AtomicBoolean(true);
//		System.out.println(atomicBoolean.get());
//		boolean setResult1 = atomicBoolean.compareAndSet(false, true);
//		System.out.println(setResult1);
//		boolean setResult2 = atomicBoolean.compareAndSet(true, false);
//		System.out.println(setResult2);
//		System.out.println(atomicBoolean.get());
		
//		AtomicInteger integer = new AtomicInteger();
//        //设置值
//        integer.set(1);
//        //跟set一样也是设置值，只不过set方法能保证可见性，而lazySet不行
//        System.out.println(integer.get());
//        integer.lazySet(2);
//        System.out.println(integer.get());
//        //CAS操作，比较交换
//        integer.compareAndSet(2,3);
//        System.out.println(integer.get());
//        //自增后获取值
//        integer.incrementAndGet();
//        System.out.println(integer.get());
//        //与指定的值相加后返回
//        integer.addAndGet(2);
//        System.out.println(integer.get());
//        //获取之后进行自增
//        integer.getAndIncrement();
//        System.out.println(integer.get());
		
		Object referenceOne = new Object();
        Object referenceTwo = new Object();
        AtomicReference<Object> atomicReferenceOne = new AtomicReference<>(referenceOne);
        System.out.println(atomicReferenceOne.get());
        //compareAndSet时候原始的对象必须是创建AtomicReference的时候设置的对象
        boolean resultOne = atomicReferenceOne.compareAndSet(referenceTwo, referenceOne);
        System.out.println(resultOne);
        //compareAndSet时候原始的对象必须是创建AtomicReference的时候设置的对象
        boolean resultTwo = atomicReferenceOne.compareAndSet(referenceOne, referenceTwo);
        System.out.println(resultTwo);
        //获取然后更新函数执行结果返回的值
        atomicReferenceOne.getAndUpdate((one -> referenceTwo));
        System.out.println(atomicReferenceOne.get());
        
	}

}
