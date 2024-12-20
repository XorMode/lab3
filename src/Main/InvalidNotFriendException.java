package Main;

public class InvalidNotFriendException extends RuntimeException{
	@Override
	public String getMessage() {
		return "Ребятки уже не знакомы";
	}
}
