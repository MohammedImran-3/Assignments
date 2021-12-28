package org.shopping;

public class ItemsInfo {

	private String name;
	private double price;
	private int quantity;

	public ItemsInfo(String itemname, double itemprice, int numpurchased) {
		name = itemname;
		price = itemprice;
		quantity = numpurchased;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}

}