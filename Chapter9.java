
public class Chapter9 {

	public static void main(String[] args) {
		String str1 = new String("hi");
		string str2 = "hello";
		
		//Autoboxing
		Integer i1 = 3;
		Byte b1 = 4;
		
		System.out.println(i1 < b1); // unbox
		System.out.print(str1.compareTo(str2)); //(str1 < str2);
		
		double gasCost = 2.44;
		//Double gas = new Double(gasCost); incorrect
		gas = Double.valueOf(gasCost); // correct
		
		gas = gasCost;
		gas = 2.55;
		
		double myGas = gas; //unbox
		myGas = gas.doubleValue;
		
		Integer i2 = new Integer(gas.intValue());
		Integer i3 = Integer.valueOf(i2.intValue());
		
		System.outprintln("i2 is " + i2 + "i3 is " + i3);
		
		System.out.println(i2 == i3);
		System.out.println(i2.equals(i3));
		
		int var = 33;
		System.out.println(i2.toString());
		System.out.println(Integer.toString(var) + "77");

	}

}
