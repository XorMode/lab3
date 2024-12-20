package Main;

public class InvalidAlreadyFriendException extends RuntimeException {

	@Override
	public String getMessage() {
		return "Ребятки уже знакомы";
	}
	
}
