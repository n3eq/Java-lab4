package app.test;

import app.airplane.Awionetka;

public class Test {

	public static void main(String[] args) {

		Awionetka awionetka = new Awionetka("Damian Linek", 800);

		System.out.println(awionetka);

		awionetka.fill(200);

		System.out.println(awionetka);

		awionetka.fly();
	}

}
