
public class Euclid {
	public static void main(String[] args) {
		System.out.println(euclid(12, 4));
	}

// Iterative
	public static int euclid(int m, int n) {
		while (true) {
			int r = m % n; // E1
			if (r == 0) { // E2
				return n;
			}
			m = n;
			n = r;
		}
	}
}
	
// Recursive
//	public static int euclid(int m, int n) {
//		if((m % n) == 0) return 0;
//		return euclid(n, m % n);
//	}
//		
//}
