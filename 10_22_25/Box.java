
//Define the clsss(or interface) type parameter
public class Box<T> {
	private T object;
	
	//get and setter
	public void set(T o) {
		this.object = o;
	}
	
	public T get() {
		return object;
	}

}
