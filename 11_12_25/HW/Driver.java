import edu.una.cis.MariaDBClassFactory;

public class Driver {
	
	private static ClassFactory factory;
	
	private static void show() {
		factory.fetchAllClasses();
	}
	
	private static void show(int id) {
		
	}

	public static void main(String[] args) {
		factory = new MariaDBClassFactory();
		show();

	}

}
