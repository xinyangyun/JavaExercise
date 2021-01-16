package atguigu.factorymethod.pizzastore.order;

import atguigu.factorymethod.pizzastore.pizza.BJCheesePizza;
import atguigu.factorymethod.pizzastore.pizza.BJPepperPizza;
import atguigu.factorymethod.pizzastore.pizza.Pizza;

public class BJOrderPizza extends OrderPizza{

	@Override
	Pizza createPizza(String orderType) {
		
		Pizza pizza = null;
		if (orderType.equals("cheese")) {
			pizza = new BJCheesePizza();
		}else if(orderType.equals("pepper")) {
			pizza = new BJPepperPizza();
		}
		
		return pizza;
	}

}
