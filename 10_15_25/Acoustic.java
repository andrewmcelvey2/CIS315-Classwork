package com.musicrus;

public class Acoustic extends Guitar {
	public Acoustic(int yr, String make) {
		super(yr, make);
	}
	
	/*copy constructor*/
	public Acoustic(Guitar original) {
		super(original);
	}
}
