import java.util.*;


public class TournamentMap {

	public static void main(String[] args) {
		
		
//		populateList(list);
//		
//		populateMap(map, list);
		
		Scanner sysin = new Scanner(System.in);
		String input = "";
		do {
			//menu
			displayMenu();
			//user input
			input = sysin.nextLine();
			//do: display, lookup, quit
			
		} while (!input.startsWith("q"));
		
		System.out.print("bye.");

	}
	
	private static void displayMenu() {
		System.out.println("Menu");
	}
	
//	populateMap(map, list) {
//		
//	}
//	
//	populateList(list) {
//		

}
