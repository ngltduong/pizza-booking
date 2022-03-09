package app.Pizzas.DNPizzas;

import app.Pizzas.Base.Pizza;

public class DNCheesePizza extends Pizza {
	public DNCheesePizza() {
		name = "The best DN Cheese Pizza";
		dough = "Very thin DN dough";
		sauce = "Very spicy DN sauce";
		toppings.add("Black olives");
		toppings.add("Cheese");
	}
	public void box() {
		super.box();
		System.out.print("Boxed the tasty pizza");
	}
}
