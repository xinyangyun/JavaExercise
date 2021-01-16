package generic;

public class GenericTest3 {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		Generic<Integer> genericInteger = new Generic<Integer>(123456);
		Generic<String> genericString = new Generic<String>("key_value");
		
//		System.out.println("泛型测试，key is " + genericInteger.getKey());
//		System.out.println("泛型测试，key is " + genericString.getKey());
		
		//定义泛型类的时候，并不是一定要传入泛型类型实参。
		//使用泛型的时候如果传入泛型实参，则会根据传入的泛型实参做相应的限制，此时泛型才会起到本应起到的限制作用
		//如果不传入泛型类型实参的话，在泛型类中使用泛型的方法或成员变量定义的类型可以为任何的类型
		Generic generic = new Generic("111111");
		Generic generic1 = new Generic(44444);
		Generic generic2 = new Generic(55.55);
		Generic generic3 = new Generic(false);
		
		System.out.println("泛型测试，key is " + generic.getKey());
		System.out.println("泛型测试，key is " + generic1.getKey());
		System.out.println("泛型测试，key is " + generic2.getKey());
		System.out.println("泛型测试，key is " + generic3.getKey());
		
		//注意
		//泛型的类型参数只能是类类型，不能是简单类型
		//不能对确切的泛型类型使用instanceof操作。
		//如下面操作是非法的，编译时会出错
//		if(ex_num instanceof Generic<Number>){ }
		
		//泛型接口测试
		FruitGenerator fruitGenerator = new FruitGenerator();
		System.out.println(fruitGenerator.next());
		
		//泛型通配符测试
		Generic<Integer> gInteger = new Generic<Integer>(123);
		Generic<Number> gNumber = new Generic<Number>(456);
//		showKeyValue(gInteger);//会报错可以得出结论：同一种泛型可以对应多个版本（因为参数类型是不确定的）
							   //不同版本的泛型类实例是不兼容的
		//解决方法：将showKeyValue修改：
//		public static void showKeyValue(Generic<?> obj) {
//			System.out.println("泛型测试，key is " + obj.getKey());
//		}
		showKeyValue(gNumber);//正常运行
		showKeyValue(gInteger);
		
		//泛型方法
		Object obj = genericMethod(Class.forName("generic.MethodTest"));
		System.out.println(obj);
		
		//泛型上下边界
		Generic<String> generic4 = new Generic<String>("111111");
		Generic<Integer> generic5 = new Generic<Integer>(22222);
		Generic<Float> generic6 = new Generic<Float>(2.4f);
		Generic<Double> generic7 = new Generic<Double>(2.56);
		
		//会报错，因为String 类型并不是Number类型的子类
//		showKeyValue1(generic4);//会报错，因为String 类型并不是Number类型的子类
		
		showKeyValue1(generic5);
		showKeyValue1(generic6);
		showKeyValue1(generic7); 
		
	}
	
	
	//泛型通配符测试
//	public static void showKeyValue(Generic<Number> obj) {
//		System.out.println("泛型测试，key is " + obj.getKey());
//	}
	
	//泛型通配符测试
	public static void showKeyValue(Generic<?> obj) {
		System.out.println("泛型测试-通配符，key is " + obj.getKey());
	}
	
	//泛型方法 
	public static <T> T genericMethod(Class<T> tClass) throws InstantiationException, IllegalAccessException {
		T instance = tClass.newInstance();
		return instance;
	}
	
	
	//泛型上下边界
	public static void showKeyValue1(Generic<? extends Number> obj) {
		System.out.println("泛型测试-上下边界，key is " + obj.getKey());
	}
}
