package atguigu.singleton.pizzastore.order;

import atguigu.singleton.pizzastore.pizza.CheesePizza;
import atguigu.singleton.pizzastore.pizza.GreekPizza;
import atguigu.singleton.pizzastore.pizza.PepperPizza;
import atguigu.singleton.pizzastore.pizza.Pizza;

//�򵥹�����
public class SimpleFactory {

	// ����orderType,���ض�Ӧ��Pizza����
	public Pizza createPizza(String orderType) {

		Pizza pizza = null;

		System.out.println("ʹ�ü򵥹���ģʽ");
		if (orderType.equals("greek")) {
			pizza = new GreekPizza();
			pizza.setName(" ϣ������ ");
		} else if (orderType.equals("cheese")) {
			pizza = new CheesePizza();
			pizza.setName(" �������� ");
		} else if (orderType.equals("pepper")) {
			pizza = new PepperPizza();
			pizza.setName("��������");
		}
		return pizza;
	}

	// �򵥹���ģʽҲ�о�̬����ģʽ
	public static Pizza createPizza2(String orderType) {

		Pizza pizza = null;

		System.out.println("ʹ�ü򵥹���ģʽ");
		if (orderType.equals("greek")) {
			pizza = new GreekPizza();
			pizza.setName(" ϣ������ ");
		} else if (orderType.equals("cheese")) {
			pizza = new CheesePizza();
			pizza.setName(" �������� ");
		} else if (orderType.equals("pepper")) {
			pizza = new PepperPizza();
			pizza.setName("��������");
		}
		return pizza;
	}

}
