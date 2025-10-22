package com.musicrus;

import java.io.Serializable;

public class ElectricGuitar extends Guitar implements Serializable, Powered {
	public ElectricGuitar(int yr, String make) {
		super(yr, make);
	}
	
	@Override
	public String play() {
		return "crunch";
	}
}
