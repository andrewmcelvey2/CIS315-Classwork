
public class TooOldException extends Exception {
	private static final long serialVersionUID = -3573606604748716500L;

	public TooOldException() {
		super("Older than reasonable age");
	}
	
	public TooOldException(String msg) {
		super(msg);
	}
}
