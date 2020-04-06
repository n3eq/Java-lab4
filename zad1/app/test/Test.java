package app.test;

import app.man.Man;
import app.woman.Woman;

public class Test {

	public static void main(String[] args) {

		Man man1 = new Man("Jan", "Kowal", (byte) 29, 182, 80, "mężczyzna", "zielone", "czarne");
		Woman woman1 = new Woman("Agata", "Kowal", (byte) 27, 169, 52, "kobieta", "niebieskie", "rude");

		Man man2 = new Man("Jasio", "Kowal", (byte) 0, 55, 4, "mężczyzna", "niebieskie", "czarne");

		man1.setBeard(true);

		System.out.println("dane kobiety: \n" + woman1);
		System.out.println("dane mezczyzny: \n" + man1);
		woman1.childConception(man2);
	}

}
