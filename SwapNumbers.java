
public class SwapNumbers {
	
	static void swap(int v1, int v2) {
		int tmp = v1;
		v1 = v2;
		v2 = tmp;
	}
	
	public static void main(String[] args) {
		int num1 = 1;
		int num2 = 2;
		
		swap(num1, num2);
		System.out.println("num1 = " + num1 + "num2 = " + num2);
	}

}
