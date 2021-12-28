package org.test;

import java.util.HashMap;
import java.util.Map;

public class Restaurant {
	
	public static void main(String[] args) {
		
		Map<String, Beverage> menu = new HashMap<String, Beverage>();
		
		menu.put("Fried Rice", new Beverage("Fried Rice", 123));
		menu.put("Toast Bread", new Beverage("Toast Bread", 320));

		Order order1 = new Order();
		order1.add(menu.get("Fried Rice"), 2);
		order1.add(menu.get("Toast Bread"), 3);
		order1.add(menu.get("Mixed Rice"), 1);

		System.out.println("Total for order 1: " + order1.getTotal());

		Order order2 = new Order();
		order2.add(menu.get("Chicken Rice"), 1);
		order2.add(menu.get("Mixed Rice"), 1);
		order2.add(menu.get("Toast Bread"), 2);

		System.out.println("Total for order 2: " + order2.getTotal());
	}

}
