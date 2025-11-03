package com.nfl;

public class Quarterback { 
	private String id;
	private String name;
	private String team;
	private int yards;
	
	public Quarterback(String id, String name, String team, int yards) {
		this.id = id;
		this.name = name;
		this.team = team;
		this.yards = yards;
	}
	
	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public int getYards() {
		return yards;
	}

	public void setYards(int yards) {
		this.yards = yards;
	}
	
	@Override
	public String toString() {
		return id + " " + name + " " + team + " " + yards;
	}
}
