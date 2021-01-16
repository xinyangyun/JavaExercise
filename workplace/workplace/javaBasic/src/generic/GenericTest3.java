package generic;

public class GenericTest3 {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		Generic<Integer> genericInteger = new Generic<Integer>(123456);
		Generic<String> genericString = new Generic<String>("key_value");
		
//		System.out.println("���Ͳ��ԣ�key is " + genericInteger.getKey());
//		System.out.println("���Ͳ��ԣ�key is " + genericString.getKey());
		
		//���巺�����ʱ�򣬲�����һ��Ҫ���뷺������ʵ�Ρ�
		//ʹ�÷��͵�ʱ��������뷺��ʵ�Σ������ݴ���ķ���ʵ������Ӧ�����ƣ���ʱ���ͲŻ��𵽱�Ӧ�𵽵���������
		//��������뷺������ʵ�εĻ����ڷ�������ʹ�÷��͵ķ������Ա������������Ϳ���Ϊ�κε�����
		Generic generic = new Generic("111111");
		Generic generic1 = new Generic(44444);
		Generic generic2 = new Generic(55.55);
		Generic generic3 = new Generic(false);
		
		System.out.println("���Ͳ��ԣ�key is " + generic.getKey());
		System.out.println("���Ͳ��ԣ�key is " + generic1.getKey());
		System.out.println("���Ͳ��ԣ�key is " + generic2.getKey());
		System.out.println("���Ͳ��ԣ�key is " + generic3.getKey());
		
		//ע��
		//���͵����Ͳ���ֻ���������ͣ������Ǽ�����
		//���ܶ�ȷ�еķ�������ʹ��instanceof������
		//����������ǷǷ��ģ�����ʱ�����
//		if(ex_num instanceof Generic<Number>){ }
		
		//���ͽӿڲ���
		FruitGenerator fruitGenerator = new FruitGenerator();
		System.out.println(fruitGenerator.next());
		
		//����ͨ�������
		Generic<Integer> gInteger = new Generic<Integer>(123);
		Generic<Number> gNumber = new Generic<Number>(456);
//		showKeyValue(gInteger);//�ᱨ����Եó����ۣ�ͬһ�ַ��Ϳ��Զ�Ӧ����汾����Ϊ���������ǲ�ȷ���ģ�
							   //��ͬ�汾�ķ�����ʵ���ǲ����ݵ�
		//�����������showKeyValue�޸ģ�
//		public static void showKeyValue(Generic<?> obj) {
//			System.out.println("���Ͳ��ԣ�key is " + obj.getKey());
//		}
		showKeyValue(gNumber);//��������
		showKeyValue(gInteger);
		
		//���ͷ���
		Object obj = genericMethod(Class.forName("generic.MethodTest"));
		System.out.println(obj);
		
		//�������±߽�
		Generic<String> generic4 = new Generic<String>("111111");
		Generic<Integer> generic5 = new Generic<Integer>(22222);
		Generic<Float> generic6 = new Generic<Float>(2.4f);
		Generic<Double> generic7 = new Generic<Double>(2.56);
		
		//�ᱨ����ΪString ���Ͳ�����Number���͵�����
//		showKeyValue1(generic4);//�ᱨ����ΪString ���Ͳ�����Number���͵�����
		
		showKeyValue1(generic5);
		showKeyValue1(generic6);
		showKeyValue1(generic7); 
		
	}
	
	
	//����ͨ�������
//	public static void showKeyValue(Generic<Number> obj) {
//		System.out.println("���Ͳ��ԣ�key is " + obj.getKey());
//	}
	
	//����ͨ�������
	public static void showKeyValue(Generic<?> obj) {
		System.out.println("���Ͳ���-ͨ�����key is " + obj.getKey());
	}
	
	//���ͷ��� 
	public static <T> T genericMethod(Class<T> tClass) throws InstantiationException, IllegalAccessException {
		T instance = tClass.newInstance();
		return instance;
	}
	
	
	//�������±߽�
	public static void showKeyValue1(Generic<? extends Number> obj) {
		System.out.println("���Ͳ���-���±߽磬key is " + obj.getKey());
	}
}
