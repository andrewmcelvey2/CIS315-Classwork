import java.util.*;

public class Lesson_12a {
	public static void main(String[] args) {
		//1. Create a Linked List (code to an interface)
		List<Integer> list = new LinkedList<>();
		
		//2. add a bunch of elements
		list.add(0);
		list.add(1, new Integer(1));
		list.add(2);
		list.add(3);
		
		System.out.println(list);
		
		//3. Test; Get/Set/Add/Remove
		
		
		//4. Try ListIterator
		
		
		//5. Overloaded remove(int) vs remove(<Object>)
		list.remove(1);
		
		System.out.println(list);
	}
}
