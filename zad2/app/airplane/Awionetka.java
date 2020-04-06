package app.airplane;

public class Awionetka extends Airplane {

	private String ownerName;

	public Awionetka(String owner, int amountOfFuel) {
		super(amountOfFuel);
		this.ownerName = owner;
	}
}
