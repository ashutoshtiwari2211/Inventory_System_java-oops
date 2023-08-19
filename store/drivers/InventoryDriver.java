package com.javaoo.store.drivers;

import java.util.Date;

import com.javaoo.store.*;
public class InventoryDriver {

	public static void main(String[] args) {
		Item[] myInventory = new Item[50];
		myInventory[0] = new Book("The Upside Down King", 193.00, 38, 
				"Sudha Murthy", "ransom House", "Fiction");
		myInventory[1] = new Book("The Ministry of Utmost Happiness", 348.25, 40,
				"Arundhati Roy", "Hamish Hamilton", "Literary Fiction");
		myInventory[2] = new Book("An Era of Darkness: The British Empire in India", 217.55, 55, 
				"Shashi Tharoor", "Aleph Book Company", "History");
		myInventory[3] = new Book("The Alchemist", 249.00, 90, 
				"Paulo Coelho", "HarpinCollins India", "Fiction/Inspiration");
		myInventory[4] = new Book("Ikigai: The Japanese Secret to a Long and Happy Life", 269.00, 200,
				"Hector Garcia", "Penguin Random House India", "Self-Help");
		
		
		
		myInventory[5] = new CD("Made in India", 15.24, 10, 
				new Artist("Alisha Chinai"), new Date("07/07/1995"));
		myInventory[6] = new CD("Aashiqui", 24.05, 7, 
				new Artist("Nadeem-Shravan"), new Date("07/07/1989"));
		
		String[] performers = {"Lata", "BuppyDa", "Raphi", "Suresh"};
		myInventory[7] = new ClassicalCD("Vandhe Matram", 0.35, 1000,
				"Malik", performers, "Mumbai", new Date("07/08/1979"));
		
		Inventory.produceReport(myInventory);
		

	}

}
