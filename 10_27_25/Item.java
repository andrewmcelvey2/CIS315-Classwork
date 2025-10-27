package com.acme;

public abstract class Item {
	private int skuNumber;
	
	public Item(int sku) {
		this.skuNumber = sku;
		
	}
	
	public int getSkuNumber() {
		return skuNumber;
	}
}
