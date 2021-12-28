package org.test;

public class Beverage {

	private String name;
	private double cost;

	public Beverage(String name, double cost) {
		this.name = name;
		this.cost = cost;
	}

	public double getCost() {
		return this.cost;
	}

	public String getName() {
		return this.name;
	}

}
