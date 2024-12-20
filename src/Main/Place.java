package Main;

public record Place(String name) implements Locatable{
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public Place getPlace( ) {
		return this;
	}
	
	public class Tube{
		private String name = "труба";
		
		private Tube() {}
		
		public String getName( ) {
			return name;
		}
		
	}
	
	public Tube createTube() {
		try {
			if ( this.name != "дом") {
				throw new InvalidTubePlaceException();
			}
			return new Tube();
		} catch (InvalidTubePlaceException exception) {
			System.out.println(exception.getMessage());
			return null;
		}
	}
}
