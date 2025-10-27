package com.acme;

public class TechItem extends Item implements Comparable<TechItem> {
	private String orderNumber;
	private String company;
	private int quantity;
	
	public TechItem(int sku, String onum, String comp, int qty) {
		super(sku);
		this.orderNumber = onum;
		this.company = comp;
		this.quantity = qty;
		
	}
	
	@Override
	public int hashCode() {
		return orderNumber.hashCode();
	}
	
	
	//IMPORTANT: 3 Tests; 1. if its null; 2. 
	@Override
	public boolean equals(Object o) {
		if (o == null) {
			return false;
		} if (o == this) {
			return true;
		}
		if (o instanceof TechItem) {
			TechItem other = (TechItem) o;
			if (this.orderNumber.equals(other.orderNumber)) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int compareTo(TechItem other) {
		return orderNumber.compareTo(other.orderNumber);
	}
	
	@Override
	public String toString() {
		return getSkuNumber() + " " + orderNumber + " " + company + " " + quantity;
	}
}
