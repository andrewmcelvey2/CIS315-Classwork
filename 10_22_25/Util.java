
public class Util {
	/**
	 * Compares 2 Pair Objects
	 * 
	 * @param p1 pair 1
	 * @param p2 pair 2
	 * @return true if keys AND values match
	 */
	public static <K, V, S> boolean compare(Pair<K, V> p1, Pair<K, S> p2) {
		return p1.getKey().equals(p2.getKey());
	}

}
