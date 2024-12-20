package Main;

public interface Flyable {
	public void fly(Place newPlace);
	public void flyNearWith(Locatable item);
	public void circleArround(int rounds);
	public int getFlightSpeed();
	public void setFlightSpeed(int flightSpeed);
	public int getFlightHeight();
	public void setFlightHeight(int flightHeight);
}
