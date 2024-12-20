package Main;

public class InvalidTubePlaceException extends RuntimeException{
	@Override
	public String getMessage() {
		return "Невозможно создать трубу не в доме";
	}
}
