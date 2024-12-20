package Main;

public class Karlson extends Character implements Flyable {
	private int flightSpeed;
	private int flightHeight;
	private Place home;
	boolean isKnown;
	
	public Karlson(String name, int age, Place place, String description, boolean isKnown, int flightSpeed, int flightHeight, Place home) {
		super(name, age, place, description, isKnown);
		this.flightSpeed = flightSpeed;
		this.flightHeight = flightHeight;
		this.home = home;
	}
	
	public Place getHome() {
		return this.home;
	}
	
	public void setHome(Place home) {
		this.home = home;
	}
	
	public int getFlightSpeed() {
		return flightSpeed;
	}

	
	public void setFlightSpeed(int flightSpeed) {
		this.flightSpeed = flightSpeed;
	}

	
	public int getFlightHeight() {
		return flightHeight;
	}

	
	public void setFlightHeight(int flightHeight) {
		this.flightHeight = flightHeight;
	}
	
	public void makeSound(Sound sound) {
		System.out.println(getName() + " издает " + sound.getName());
	}
	
	public void liveOnPlace() {
		System.out.println(this.getName() + " живет на " + this.getHome().getName());
	}
	
	@Override
	public int hashCode() {
		return 13 * (flightSpeed + flightHeight) + home.hashCode();
	}

	@Override
	public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Karlson karlson = (Karlson) object;
        return flightSpeed == karlson.flightSpeed && flightHeight == karlson.flightHeight && home.equals(karlson.getHome());
    }

	@Override
	public String toString() {
		return getName() + home.getName();
	}

	public void lookAtPerson(Character character, String description) {
		System.out.println(this.getName() + " окинул " + character.getName() + " " + description + " взглядом");
	}
	
	public void goBack() {
		System.out.println(this.getName() + " повернул назад ");
	}
	
	@Override
	public void fly(Place newPlace) {
		System.out.println(this.getName() + " прилетел из " + this.getPlace().getName() +  " к " + newPlace.getName());
		this.setPlace(newPlace);
	}
	
	public void fly(Place place, Place.Tube newPlace) {
		System.out.println(this.getName() + " прилетел из " + this.getPlace().getName() +  " к " + newPlace.getName());
		this.setPlace(place);
	}


	@Override
	public void flyNearWith(Locatable item) {
		System.out.println(this.getDescription() + " " +getName() + " пролетел рядом с " + item.getName());
		this.setPlace(item.getPlace());
	}
	

	@Override
	public void circleArround(int rounds) {
		System.out.println(this.getName() + " сделал " + rounds + " круга около " + this.getPlace().getName());
	}
	
	public void getHigher () {
		this.setFlightHeight(flightHeight + 30);
		System.out.println(this.getName() + " набрал высоту");
	}
	
	public void getFaster () {
		this.setFlightSpeed(flightSpeed + 20);
		System.out.println(this.getName() + " прибавил скорость");
	}
	
}
