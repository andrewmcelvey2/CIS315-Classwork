package org.nit;

public class Team {
	private String name;
	private String coach;
	
	public Team(String name, String coach) {
		this.name = name;
		this.coach = coach;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return name + " Coach: " + coach;
	}
}
