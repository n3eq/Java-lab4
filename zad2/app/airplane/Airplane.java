package app.airplane;

public class Airplane {

	private int range;
	private int amountOfFuel;

	public Airplane(int amountOfFuel) {

		this.amountOfFuel = amountOfFuel;
		this.range = amountOfFuel / 6;
	}

	public void fill(int n) {
		amountOfFuel += n;
		range = amountOfFuel / 6;
		System.out.println("dodano: " + n + " litrow paliwa.");
	}

	public void fly() {
		if (amountOfFuel < 1000) {
			System.out.println("Za mało paliwa !!!");
		} else {
			System.out.println("Lecimy !!!");
		}
	}

	@Override
	public String toString() {
		return "range: " + range + " km." + "\namountOfFuel: " + amountOfFuel + " l.";
	}
}
