package org.test;

import java.util.HashMap;
import java.util.Map;

public class Order {

	private Map<Beverage, Integer> beverages = new HashMap<Beverage, Integer>();

	public double getTotal() {

		double total = 0;

		for (Beverage i : this.beverages.keySet()) {

			Integer quantity = this.beverages.get(i);
			
			total=total+(i.getCost()*quantity);
			
		}

		return total;
	}

	public void add(Beverage beverage, Integer quantity) {
		this.beverages.put(beverage, quantity);
	}

}
