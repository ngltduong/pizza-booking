package app.Pizzas.HCMPizzas;

import app.Pizzas.Base.Pizza;

public class HCMCheesePizza extends Pizza {
	public HCMCheesePizza() {
		name = "The best HCM Cheese Pizza";
		dough = "Very thin HCM dough";
		sauce = "Very spicy HCM sauce";
		toppings.add("Black olives");
		toppings.add("Cheese");
	}
	public void box() {
		super.box();
		System.out.print("Boxed the tasty pizza");
	}
}
