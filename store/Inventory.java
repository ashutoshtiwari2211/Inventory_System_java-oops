package com.javaoo.store;

public class Inventory {
	public static void produceReport(Item[] items) {
		int totalItems = 0;
		double totalValue = 0.0;
		System.out.format("%-60s %-15s %s %n %n", "Title", "Quantity", "Price");
		for(Item item: items) {
			if(item == null) continue;
			totalItems += item.getQuantity();
			totalValue += (double)(item.getPrice() * item.getQuantity());
			System.out.format("%-60s %-15d \u20B9%.2f %n", item.getTitle(), item.getQuantity(), item.getPrice());
		}
		
		for(int i=0; i<100; i++) System.out.printf("-");

		System.out.println();
		System.out.format("%-60s %-15d \u20B9%.2f %n", "Total", totalItems, totalValue);
		//System.out.format("Total Value %60.2f /-" + "%n", totalValue);
		
	}

}
