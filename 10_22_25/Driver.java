import java.util.LinkedList;
import java.util.List;


public class Driver {
	public static void main(String[] args) {
		List stuff = new LinkedList<>();
		
		
		//Create p1 key "Even" value 8
		//Rule: code to an interface instead of an implementation
		Pair<String, Integer> p1 = new OrderedPair<String, Integer>("Even", 8);
		
		System.out.println(p1);
		
		//Create p2 key "hello" value "world"
		Pair<String, String> p2 = new OrderedPair<String, String>("hello", "world");
		
		if (p2.getValue() instanceof String) {
			System.out.println("it's a string");
		}
		
		boolean same = Util.compare(p1, p2);
		if (same) {
			System.out.println("Same");
		} else {
			System.out.println("Different");
		}
	}

//	public static void main(String[] args) {
//		Box<Integer> b1 = new Box();
//		b1.set(5);
//		
//		Box<String> b2 = new Box();
//		b2.set(new String ("hi"));
//		
//		System.out.println(b1.get());
//		System.out.println(b2.get());
//		
//		//Declaring a new variable
//		Box<Car> b3;
//		
//		//Instantiate an object
//		b3 = new Box<Car>();
//		
//		b3.set(new Car());
//		System.out.println(b3.get());
//		
//
//	}

}
