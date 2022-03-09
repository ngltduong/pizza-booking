package app.Pizzas.Base;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
	protected String name;
	protected String dough;
	protected String sauce;
	protected List<String> toppings = new ArrayList<String>();
	
	
	public void prepare() {
		System.out.println("Preparing " + name);
		System.out.println("Tossing dough..." + dough);
		System.out.println("Adding sauce..." + sauce);
		System.out.println("Adding topping:");
		if(toppings != null) {
			for(String topping : toppings) {
				System.out.print(topping + "\t");
			}	
		}
	}
	
	public void bake() {
		System.out.println("Baking " + name + "in 30 mins");
	}
	public void cut() {
		System.out.println("Cutting " + name);
	}
	public void box() {
		System.out.println("Boxing " + name);
	}
}
