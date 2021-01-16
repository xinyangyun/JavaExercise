package generic;

import java.util.Random;

//实现了泛型接口的类，未传入泛型实参
//public class FruitGenerator<T> implements Generator<T>{
//	@Override
//	public T next() {
//		return null;
//	}
//}

//实现了泛型接口的类，传入泛型实参时
public class FruitGenerator implements Generator<String>{

	private String[] fruits = new String[] {"Apple","Banana","Pear"};
	
	@Override
	public String next() {
		Random random = new Random();
		return fruits[random.nextInt(3)];
	}
}