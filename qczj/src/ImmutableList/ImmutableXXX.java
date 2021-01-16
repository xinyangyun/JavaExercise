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
//        //����ֵ
//        integer.set(1);
//        //��setһ��Ҳ������ֵ��ֻ����set�����ܱ�֤�ɼ��ԣ���lazySet����
//        System.out.println(integer.get());
//        integer.lazySet(2);
//        System.out.println(integer.get());
//        //CAS�������ȽϽ���
//        integer.compareAndSet(2,3);
//        System.out.println(integer.get());
//        //�������ȡֵ
//        integer.incrementAndGet();
//        System.out.println(integer.get());
//        //��ָ����ֵ��Ӻ󷵻�
//        integer.addAndGet(2);
//        System.out.println(integer.get());
//        //��ȡ֮���������
//        integer.getAndIncrement();
//        System.out.println(integer.get());
		
		Object referenceOne = new Object();
        Object referenceTwo = new Object();
        AtomicReference<Object> atomicReferenceOne = new AtomicReference<>(referenceOne);
        System.out.println(atomicReferenceOne.get());
        //compareAndSetʱ��ԭʼ�Ķ�������Ǵ���AtomicReference��ʱ�����õĶ���
        boolean resultOne = atomicReferenceOne.compareAndSet(referenceTwo, referenceOne);
        System.out.println(resultOne);
        //compareAndSetʱ��ԭʼ�Ķ�������Ǵ���AtomicReference��ʱ�����õĶ���
        boolean resultTwo = atomicReferenceOne.compareAndSet(referenceOne, referenceTwo);
        System.out.println(resultTwo);
        //��ȡȻ����º���ִ�н�����ص�ֵ
        atomicReferenceOne.getAndUpdate((one -> referenceTwo));
        System.out.println(atomicReferenceOne.get());
        
	}

}
