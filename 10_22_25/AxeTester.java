import java.util.ArrayList;

import com.musicrus.Acoustic;
import com.musicrus.ElectricGuitar;
import com.musicrus.Guitar;
import com.musicrus.Powered;

public class AxeTester {

	public static void main(String[] args) {
		Guitar cutaway = new Acoustic(2019, "Martin");
		Guitar lesPaul = new ElectricGuitar(1959, "Gibson");
		Guitar strat = new ElectricGuitar(1967, "Fender");
		Guitar dreadnought = new Acoustic(1983, "Yamaha");
		Guitar tele = new ElectricGuitar(2017, "Fender");
		
		System.out.println(tele.getNumberOfStrings());
		
		Guitar om = new Acoustic(dreadnought);
		
		om.breakString();
		
		System.out.println(dreadnought.getNumberOfStrings());
		System.out.println(om.getNumberOfStrings());
		om.setYear(2024);
		om.setMake("Banks");
		
		ArrayList<Guitar> guitars = new ArrayList<>();
		guitars.add(tele);
		guitars.add(dreadnought);
		guitars.add(lesPaul);
		guitars.add(om);
		guitars.add(strat);
		guitars.add(cutaway);
		
		for (Guitar g : guitars) {
			System.out.println(g.play());
			if (g instanceof Powered) {
				System.out.println(g.getYear() + " electrics are powered");
			}
		}
		
	}

}
