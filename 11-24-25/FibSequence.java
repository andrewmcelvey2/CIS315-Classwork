
public class FibSequence {
	
	
	public static void main(String[] args) {
		System.out.println(fib(4));
	}
	
	private static long fib(long index) {
		if(index == 0) return 0;
		if(index == 1) return 1;
		return fib(index - 1) + fib(index - 2);
	}
}
