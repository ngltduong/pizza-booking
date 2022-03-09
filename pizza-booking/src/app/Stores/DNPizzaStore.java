package app.Stores;

import app.Pizzas.Base.Pizza;
import app.Pizzas.DNPizzas.DNCheesePizza;
import app.Pizzas.DNPizzas.DNGreekPizza;
import app.Pizzas.DNPizzas.DNPeperoniPizza;
import app.Stores.Base.PizzaStore;

public class DNPizzaStore extends PizzaStore {

		@Override
		protected Pizza createPizza(String type) {
			switch(type) 
			{
				case "cheese":
					return new DNCheesePizza();
				case "greek":
					return new DNGreekPizza();
				case "pepeproni":
					return new DNPeperoniPizza();
				default:
					return null;
			}
		}
	
}
