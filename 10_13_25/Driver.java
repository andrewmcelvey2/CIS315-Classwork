import java.util.ArrayList;
public class Driver {

	public static void main(String[] args) {
		ArrayList<Pet> zoo = new ArrayList<>();
		
		//Pet myPet = new Pet();
		Cat myCat = new Cat();
		myCat.setBreed("Calico");
		myCat.getBreed();
		Dog myDog = new Dog();
		
		//zoo.add(myPet);
		zoo.add(myCat);
		zoo.add(myDog);
		
		for (Pet pet : zoo) {
			pet.speak();
			System.out.println("\t" + pet);
		}
		
		myCat.setName("Fluffy");
		myDog.setName("Fluffy");
		
		if (myCat.equals(myDog)) {
			System.out.println("they are equal");
		} else {
			System.out.println("not equal");
		}
		
		//System.out.println(zoo);

	}

}
