package Main;

public class Sound {
	private String name;
	private TypeOfVolume type;
	private int ValueOfVolume;
	
	@Override
	public int hashCode() {
		
		return name.length() * type.getName().length() + ValueOfVolume; 
	}


	@Override
	public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Sound sound = (Sound) object;
        return sound.getName() == getName() && sound.getType() == getType();
    }


	@Override
	public String toString() {
		
		return this.getName() + ValueOfVolume;
	}
	
	
	public Sound(String name, TypeOfVolume type) {
		this.name = name;
		this.type = type;
		this.connectValueWithType();
	}

	
	public String getName() {
		return name;
	}

	
	public void setName(String name) {
		this.name = name;
	}

	
	public void setType(TypeOfVolume type) {
		this.type = type;
	}

	public TypeOfVolume getType() {
		return this.type;
	}
	
	public void makeLouder(int howTimes) {
		for (int i = 0; i < howTimes; i++) {
			this.ValueOfVolume += howTimes;
			System.out.println(this.name + " становится громче");
		}
		this.connectTypeWithValue();
	}
	
	private void connectTypeWithValue() {
		if (this.ValueOfVolume >= 1000) {
			this.type = TypeOfVolume.LOUD;
		}
		else if (this.ValueOfVolume >= 500) {
			this.type = TypeOfVolume.QUITE;
		}
		else this.type = TypeOfVolume.FAINT;
	}
	
	private void connectValueWithType() {
		if (this.type == TypeOfVolume.LOUD) {
			this.ValueOfVolume = 1000;
		}
		else if (this.type == TypeOfVolume.QUITE) {
			this.ValueOfVolume = 500;
		}
		else this.ValueOfVolume = 250; 
	}
}
