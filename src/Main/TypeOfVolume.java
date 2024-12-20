package Main;

public enum TypeOfVolume {
	LOUD("громкое"),
	QUITE("тихое"),
	FAINT("слабое");
	private String name;
	private TypeOfVolume(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
}
