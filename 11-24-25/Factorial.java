
public class Factorial {
	/**
	 * factorial of 0 is 1
	 * factorial of N (for N>0) is N*N-1 ... *3*2*1
	 * 
	 * @param args
	 */
	
	public static long factorial(int n) {
		if(n < 0) {
			throw new RuntimeException("Invalid input");
		}
		int tmp = n;
		if (n == 0) return 1;
		for (int i = n - 1; i >= 1; i--) {
			tmp = tmp * i;
		} return tmp;
	}

	public static void main(String[] args) {
		System.out.println(factorial(3));

	}

}
