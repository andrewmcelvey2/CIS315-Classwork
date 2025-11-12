public class Exceptional {
	
	/**
	 * Buy a ticket; demo exception handling
	 * 
	 * @param age
	 * @return cost of ticket
	 * @throws Exception if the age is out of range
	 */
	private static double buyTicket(int age) throws Exception {
		if (age < 0) {
			throw new Exception();
		}
		if (age < 10) {
			System.out.println("youngster");
			return 0.0;
		} else if (age < 65) {
			System.out.println("full price");
			return 15.00;
		} else if (age <= 969) {
			System.out.println("senior discount");
			return 7.50;
		} else {
			throw new TooOldException();
		}
	}
	
	public static void main(String[] args) {
		try {
			System.out.println(buyTicket(2));
			System.out.println(buyTicket(22));
			System.out.println(buyTicket(80));
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
	}
	
}