package edu.osu.cse5234.business.inventorymanagement;

import java.util.*;

public class Inventory {
	List<Item> items;
	public Inventory() {}
	
	public List<Item> getItems() {
		return items;
	}
	
	public void setItems(List<Item> items) {
		this.items = items;
	}
}
