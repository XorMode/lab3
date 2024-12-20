package Main;

public class Main {

	public static void main(String[] args) {
		Place home = new Place("дом");
		Place.Tube tube = home.createTube();
		if (tube.getName() == "труба") {
			Place window = new Place("окно");
			Place roof = new Place("крыша");
			Place[] arrayOfPlaces = new Place[] {home, window, roof};
			Karlson karlson = new Karlson("Карлсон", 10, arrayOfPlaces[1], "толстый человечек", false, 100, 10, arrayOfPlaces[2]);
			Kid kid  = new Kid("Малыш", 10, arrayOfPlaces[0], "", false);
			Sound jujanie = new Sound("жужжание", TypeOfVolume.FAINT);
			kid.breathe(TypeOfBreathe.HEAVY);
			karlson.makeSound(jujanie);
			kid.hear(jujanie);
			jujanie.makeLouder(2);
			karlson.flyNearWith(arrayOfPlaces[1]);
			karlson.liveOnPlace();
			kid.showInfoAboutFriendshipWith(karlson);
			karlson.lookAtPerson(kid, "внимательным и долгим");
			karlson.getHigher();
			karlson.fly(arrayOfPlaces[2]);
			karlson.circleArround(1);
			karlson.fly(arrayOfPlaces[0],tube);
			karlson.circleArround(1);
			karlson.goBack();
			karlson.fly(arrayOfPlaces[1]);
			karlson.getFaster();
			karlson.flyNearWith(kid);
			karlson.circleArround(2);
		}
	}

}
