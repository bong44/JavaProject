package lecture10;

public class WrongPasswardException extends Exception{
	
	public WrongPasswardException() {
		
	}
	
	public WrongPasswardException(String message) {
		super(message);
	}
}
