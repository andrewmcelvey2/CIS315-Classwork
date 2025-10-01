import java.util.ArrayList;

public class lesson9c {
	
	private static void movieList() {
		ArrayList<Movie> movies = new ArrayList<Movie>();
		
		Movie starWars = new Movie("Star Wars", 1980);
		
		movies.add(starWars);
		movies.add(new Movie("Jaws", 1975));
		
		for (Movie movie : movies) {
			System.out.println(movie.getTitle());
		}
		
	}

	public static void main(String[] args) {
		//DO NOT DO
		int[] nums = {1, 2, 3};
		ArrayList<Integer> numbers = new ArrayList<>();
		
		//numbers.add(nums[0]);
		for (int i = 0; i < nums.length; i++) {
			numbers.add(i);
		}
		
		System.out.println("array list: " + numbers);
		
		ArrayList<Object> list = new ArrayList<>();
		
		int x = 3;
		
		list.add(x);
		list.add(3.14);
		list.add("Fred");
		
		//get, set, size, isEmpty, clear, remove
		
		//System.out.println(list.size());
		movieList();
		
		Integer value = 123;
		
		System.out.println(value);

	}

}
