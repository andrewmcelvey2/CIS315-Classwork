package com.musicrus;

public class Acoustic extends Guitar {
	public Acoustic(int yr, String make) {
		super(yr, make);
	}
	
	@Override
	public String play() {
		return "twang";
	}
	
	/**
	 * copy constructor
	 * 
	 * @param original
	 */
	public Acoustic(Guitar original) {
		super(original);
	}
}
