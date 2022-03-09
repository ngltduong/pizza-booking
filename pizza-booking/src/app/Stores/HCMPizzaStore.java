package app.Stores;

import app.Pizzas.Base.Pizza;
import app.Pizzas.HCMPizzas.HCMCheesePizza;
import app.Pizzas.HCMPizzas.HCMGreekPizza;
import app.Pizzas.HCMPizzas.HCMPeperoniPizza;
import app.Stores.Base.PizzaStore;

public class HCMPizzaStore extends PizzaStore{

		@Override
		protected Pizza createPizza(String type) {
			switch(type) 
			{
				case "cheese":
					return new HCMCheesePizza();
				case "greek":
					return new HCMGreekPizza();
				case "pepeproni":
					return new HCMPeperoniPizza();
				default:
					return null;
			}
		}
}
