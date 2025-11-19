
public class Add {

	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		
		if (args.length < 2) {
			System.out.println("usage: java ADD num1 num2 ...");
			return;
		}
		
		do {
			sum += Integer.parseInt(args[i++]);
		} while (i < args.length);
		
		System.out.println(sum);

	}

}
