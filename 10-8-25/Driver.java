import Zoo.*;
import java.util.ArrayList;

public class Driver {

	public static void main(String[] args) {
		Animal a = new Animal();
		System.out.println(a.toString());
		
		Frog f = new Frog();
		System.out.println(f);
		
		ArrayList<Animal> zoo = new ArrayList<>();
		zoo.add(f);
		zoo.add(new Lion("Lea 1", 500));
		zoo.add(new Lion("Lea 2", 550));
		zoo.add(new Lion("Lea 3", 560));
		
		System.out.println(zoo);

	}

}
