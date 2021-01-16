package generic;

import java.util.Random;

//ʵ���˷��ͽӿڵ��࣬δ���뷺��ʵ��
//public class FruitGenerator<T> implements Generator<T>{
//	@Override
//	public T next() {
//		return null;
//	}
//}

//ʵ���˷��ͽӿڵ��࣬���뷺��ʵ��ʱ
public class FruitGenerator implements Generator<String>{

	private String[] fruits = new String[] {"Apple","Banana","Pear"};
	
	@Override
	public String next() {
		Random random = new Random();
		return fruits[random.nextInt(3)];
	}
}