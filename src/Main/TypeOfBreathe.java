package Main;

public enum TypeOfBreathe {
	HEAVY("тяжело"),
	LIGHT("легко");
	private String name;
	private TypeOfBreathe (String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
}
