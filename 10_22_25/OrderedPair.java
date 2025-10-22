
public class OrderedPair<K, V> implements Pair<K, V> {
	//Fields
	private K key;
	private V value;
	
	public OrderedPair(K key, V Value) {
		this.key = key;
		this.value = value;
	}
	
	//Getters
	public K getKey() {
		return key;
	}
	
	public V getValue() {
		return value;
	}

}
