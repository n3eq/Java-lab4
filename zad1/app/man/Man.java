package app.man;

import app.human.Human;

public class Man extends Human {

	public Man(String name, String surname, byte age, int height, int weight, String sex, String eyesColor,
			String hairColor) {
		super(name, surname, age, height, weight, sex, eyesColor, hairColor);
	}

	private boolean beard;

	public boolean getBeard() {
		return beard;
	}

	public void setBeard(boolean beard) {
		this.beard = beard;
	}

	@Override
	public String toString() {
		return "imie " + this.getName() + "\nnazwisko " + this.getSurname() + "\nwiek" + this.getAge() + "\nwaga "
				+ this.getWeight() + "\nwysokosc " + this.getHeight() + "\nkolor oczu " + this.getEyesColor()
				+ "\nkolor wlosow " + this.getHairColor() + "\nbroda " + this.getBeard();
	}
}
