package app.woman;

import app.human.Human;
import app.man.Man;

public class Woman extends Human {

	public Woman(String name, String surname, byte age, int height, int weight, String sex, String eyesColor,
			String hairColor) {
		super(name, surname, age, height, weight, sex, eyesColor, hairColor);
	}

	public void childConception(Man man) {

		System.out.println("Poczęcie dziecka.");
		System.out.println("imie " + man.getName() + "\nnazwisko " + man.getSurname() + "\nwaga " + man.getWeight()
				+ "\nwysokosc " + man.getHeight() + "\nkolor oczu " + man.getEyesColor() + "\nkolor wlosow "
				+ man.getHairColor());
	}
}
