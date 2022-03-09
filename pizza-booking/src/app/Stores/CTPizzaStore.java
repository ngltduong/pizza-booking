package app.Stores;

import app.Pizzas.Base.Pizza;
import app.Pizzas.CTPizzas.CTCheesePizza;
import app.Pizzas.CTPizzas.CTGreekPizza;
import app.Pizzas.CTPizzas.CTPeperoniPizza;
import app.Stores.Base.PizzaStore;

public class CTPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String type) {
		switch(type) 
		{
			case "cheese":
				return new CTCheesePizza();
			case "greek":
				return new CTGreekPizza();
			case "pepeproni":
				return new CTPeperoniPizza();
			default:
				return null;
		}
	}

}
