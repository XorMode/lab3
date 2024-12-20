package Main;


public abstract class Character implements Friendable, Locatable{
	private String name;
	private int age;
	private Place place;
	private String description;
	private boolean isKnown;
	
	Character(String name, int age, Place place, String description, boolean isKnown){
	this.name = name;
	this.age = age;
	this.place = place;
	this.description = description;
	this.isKnown = isKnown;
	}

	
	public boolean getIsKnown() {
		return isKnown;
	}

	
	public void setIsKnown(boolean isKnown) {
		this.isKnown = isKnown;
	}

	@Override
	public  String getName() {
		return name;
	}

	
	public  void setName(String name) {
		this.name = name;
	}

	
	public  int getAge() {
		return age;
	}

	
	public  void setAge(int age) {
		this.age = age;
	}

	
	public  Place getPlace() {
		return place;
	}

	
	public  void setPlace(Place place) {
		this.place = place;
	}

	
	public String getDescription() {
		return description;
	}

	
	public  void setDescription(String description) {
		this.description = description;
	}
	
	public void makeAFriend(Character character) {
		try {
			if (character.getIsKnown() == true && this.getIsKnown() == true) {
				throw new InvalidAlreadyFriendException();
			}
		character.setIsKnown(true);
		this.setIsKnown(true);
		} catch (InvalidAlreadyFriendException invalidFriend) {
			System.out.println(invalidFriend.getMessage());
		}
	}

	@Override
	public void removeAFriend(Character character) {
		try {
			if (character.getIsKnown() == false && this.getIsKnown() == false) {
				throw new InvalidNotFriendException();
			}
		character.setIsKnown(false);
		this.setIsKnown(false);
		} catch (InvalidNotFriendException invalidFriend) {
			System.out.println(invalidFriend.getMessage());
		}
	}
}