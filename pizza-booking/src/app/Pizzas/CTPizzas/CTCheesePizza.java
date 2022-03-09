package app.Pizzas.CTPizzas;

import app.Pizzas.Base.Pizza;

public class CTCheesePizza extends Pizza {
	public CTCheesePizza() {
		name = "The best CT Cheese Pizza";
		dough = "Very thin CT dough";
		sauce = "Very spicy CT sauce";
		toppings.add("Black olives");
		toppings.add("Cheese");
	}
	public void box() {
		super.box();
		System.out.print("Boxed the tasty pizza");
	}
}
