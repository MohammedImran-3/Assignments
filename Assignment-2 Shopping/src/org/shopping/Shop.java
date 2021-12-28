package org.shopping;

import java.util.ArrayList;
import java.util.Scanner;

public class Shop {

	public static void main(String[] args) {

		double totalPrice = 0.0;

		Scanner scan = new Scanner(System.in);

		ArrayList<ItemsInfo> addToCart = new ArrayList<ItemsInfo>();

		for (int i = 0; i < 3; i++) {
			System.out.println("Enter the name,Price,Quantity of the " + i + "item");
			addToCart.add(new ItemsInfo(scan.next(), scan.nextDouble(), scan.nextInt()));
		}

		System.out.println("ItemName" + "\t" + "Quantity" + "\t" + "Price" + "\t\t" + "TotalPrice" + "\t");

		for (ItemsInfo ex : addToCart) {
			System.out.println(ex.getName() + "\t\t" + ex.getQuantity() + "\t\t" + ex.getPrice() + "\t\t"
					+ ex.getPrice() * ex.getQuantity() + "\t\t");
			totalPrice += ex.getPrice() * ex.getQuantity();

		}

		System.out.println("");
		System.out.println("Grand Total of the Total Cart :" + totalPrice);

	}

}