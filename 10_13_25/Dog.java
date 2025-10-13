
public class Dog extends Pet {
	private String breed;
	
	public void setBreed(String userBreed) {
		breed = userBreed;
	}
	
	@Override
	public void speak() {
		System.out.println("woof");
	}
	
	public String getBreed() {
		return breed;
	}
	
	@Override
	public String toString() {
		return super.toString() + ": dog";
	}

}
