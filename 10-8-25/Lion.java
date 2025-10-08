package Zoo;

public class Lion extends Animal {
	private String name;
	
	
	public Lion(String name, double weight) {
		super("Panthera", "leo");
		tail = true;
		super.setWeight(weight);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name + " Roar Lions";
	}
}
