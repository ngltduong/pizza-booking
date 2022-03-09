package app.Stores.Base;

import app.Pizzas.Base.Pizza;

public abstract class PizzaStore {
	
	public void orderPizza(String type) {
		Pizza pizza;
		
		pizza = createPizza(type);

		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
	}
	protected abstract Pizza createPizza(String type);
	
	
//	switch(type) 
//	{
//		case "cheese":
//			pizza = new CheesePizza();
//			break;
//		case "greek":
//			pizza = new GreekPizza();
//			break;
//		case "pepeproni":
//			pizza = new PeperoniPizza();
//			break;
//		default:
//			System.out.print("We do not have " + type + " pizza");
//			return;
//	}
}
