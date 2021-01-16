package atguigu.factorymethod.pizzastore.order;

import atguigu.factorymethod.pizzastore.pizza.LDCheesePizza;
import atguigu.factorymethod.pizzastore.pizza.LDPepperPizza;
import atguigu.factorymethod.pizzastore.pizza.Pizza;

public class LDOrderPizza extends OrderPizza{

	@Override
	Pizza createPizza(String orderType) {
		
		Pizza pizza = null;
		if (orderType.equals("cheese")) {
			pizza = new LDCheesePizza();
		}else if(orderType.equals("pepper")) {
			pizza = new LDPepperPizza();
		}
		
		return pizza;
	}

}
