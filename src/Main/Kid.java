package Main;

public class Kid extends Character {

	public Kid(String name, int age, Place place, String description, boolean isKnown) {
		super(name, age, place, description, isKnown);
	}

	
	public void showInfoAboutFriendshipWith(Character character) {
		if (!character.getIsKnown()) {
			System.out.println(this.getName() + " не знает " + character.getName());
		}
		else System.out.println(this.getName() + " знает " + character.getName());
	}
	
	@Override
	public int hashCode() {
		return 47 * getName().length() + getAge() - 13 * (this.getIsKnown() ? 1 : -1);
	}

	@Override
	public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Kid kid = (Kid) object;
        return kid.getName() == getName() && kid.getAge() == getAge() && getPlace().equals(kid.getPlace());
    }

	@Override
	public String toString() {
		return getName() + getPlace().getName();
	}
	
	public void breathe(TypeOfBreathe type) {
		System.out.println(getName() + " " + type.getName()+ " вздохнул");
	}

	@Override
	public String getName() {
		return super.getName();
	}

	@Override
	public void setName(String name) {
		super.setName(name);
	}

	@Override
	public int getAge() {
		return super.getAge();
	}

	@Override
	public void setAge(int age) {
		super.setAge(age);
	}

	@Override
	public Place getPlace() {
		return super.getPlace();
	}

	@Override
	public void setPlace(Place place) {
		super.setPlace(place);
	}

	@Override
	public String getDescription() {
		return super.getDescription();
	}

	@Override
	public void setDescription(String description) {
		super.setDescription(description);
	}

	public void hear(Sound sound) {
		System.out.println(getName() + " услышал " + sound.getType().getName() + " " + sound.getName());
	}

}
