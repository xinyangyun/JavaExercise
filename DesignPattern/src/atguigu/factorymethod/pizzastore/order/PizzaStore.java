package atguigu.factorymethod.pizzastore.order;

public class PizzaStore {
	public static void main(String[] args) {
		
		String loc = "bj";
		if (loc.equals("bj")) {
			//����������ζ�ĸ���pizza
			new BJOrderPizza();
		}else {
			//�����׶ؿ�ζ�ĸ���pizza
			new LDOrderPizza();
		}
		
	}
}
