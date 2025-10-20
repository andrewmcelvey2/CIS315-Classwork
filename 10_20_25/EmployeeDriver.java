import java.util.ArrayList;
import java.util.Collections;

public class EmployeeDriver {

	public static void main(String[] args) {
		// Hard coded list of 5 employees
		ArrayList<EmployeeData> emps = new ArrayList<>();
		EmployeeData p1 = new EmployeeData("Alan", "Smith", 001, 2);
		EmployeeData p2 = new EmployeeData("Jack", "Wild", 002, 1);
		EmployeeData p3 = new EmployeeData("Larry", "Stooge", 005, 3);
		EmployeeData p4 = new EmployeeData("Moe", "Stooge",007, 5);
		EmployeeData p5 = new EmployeeData("Curly", "Stooge", 101, 4);
		emps.add(p1);
		emps.add(p2);
		emps.add(p3);
		emps.add(p4);
		emps.add(p5);
		
		//Sort
		Collections.sort(emps);
		
		//Display
		for (EmployeeData emp : emps) {
			System.out.println(emp);
		}

	}

}
