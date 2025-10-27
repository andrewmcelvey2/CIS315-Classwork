package com.acme;

import java.util.*;

public class Inventory {
	private List<TechItem> items;
	
	public Inventory(TechItem[] techItems) {
		items = new LinkedList<>();
		for (TechItem item : techItems) {
			items.add(item);
		}
	}
	//Getters
	
	//Setters
	
	public int getInventorySize() {
		return items.size();
	}
	
	public void sort() {
		Collections.sort(items);
	}
	
	public int getInventory() {
		return items.size();
	}
	
	public void displayInventory() {
		for (TechItem item : items) {
			System.out.println(item);
		}
	}
}
