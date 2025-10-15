package com.musicrus;

import java.util.ArrayList;

public class Guitar {
	private int year;
	private String make;
	private ArrayList<GuitarString> strings;
	
	public Guitar(Guitar orig) {
		this.year = orig.year;
		this.make = orig.make;
		this.strings = orig.strings;
		for (int i = 0; i < 6; i++)
			strings.add(new GuitarString());
	}
	
	public Guitar(int year, String make) {
		this.year = year;
		this.make = make;
		this.strings = new ArrayList<GuitarString>();
		for (int i = 0; i < 6; i++) {
			strings.add(new GuitarString());
		}
	}
	
	public int getNumberOfStrings() {
		return strings.size();
	}
	
	public void breakString() {
		strings.remove(0);
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public String getMake() {
		return make;
	}
	
	public void setMake(String make) {
		this.make = make;
	}

}
