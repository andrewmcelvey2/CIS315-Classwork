package ch10.zoo;

public class Animal {
	private String genus;
	private String species;
	private double weight;
	public boolean tail;

	public Animal(String genus, String species) {
		this.genus = genus;
		this.species = species;
		this.weight = 0.0;
		this.tail = false;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getGenus() {
		return genus;
	}

	public String getSpecies() {
		return species;
	}
}
