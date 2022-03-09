package app;

import java.util.ArrayList;
import java.util.List;

import app.Stores.CTPizzaStore;
import app.Stores.DNPizzaStore;
import app.Stores.HCMPizzaStore;

public class main {

	public static void main(String[] args)  {
//		List<String> toppingList = new ArrayList<String>() ;
//		toppingList.add("Black Panther");
//		toppingList.add("Black Olives");
//		toppingList.add("Cheese");
		CTPizzaStore CTnewPizza = new CTPizzaStore();
		CTnewPizza.orderPizza("cheese");
		DNPizzaStore DNnewPizza = new DNPizzaStore();
		DNnewPizza.orderPizza("cheese");
		HCMPizzaStore hcmNewPizza = new HCMPizzaStore();
		hcmNewPizza.orderPizza("cheese");
			
	}
		
}
