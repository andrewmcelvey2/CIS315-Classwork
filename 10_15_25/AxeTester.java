package com.musicrus;

public class AxeTester {

	public static void main(String[] args) {
		Guitar cutaway = new Acoustic(2019, "Martin");
		Guitar lesPaul = new ElectricGuitar(1959, "Gibson");
		Guitar strat = new ElectricGuitar(1967, "Fender");
		Guitar dreadnought = new Acoustic(1983, "Yamaha");
		Guitar tele = new ElectricGuitar(2017, "Fender");
	}

}
