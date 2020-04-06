package app.human;

public abstract class Human {

	private String name;
	private String surname;
	private byte age;
	private int height;
	private int weight;
	private String sex;
	private String eyesColor;
	private String hairColor;

	public Human(String name, String surname, byte age, int height, int weight, String sex, String eyesColor,
			String hairColor) {

		this.name = name;
		this.surname = surname;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.sex = sex;
		this.eyesColor = eyesColor;
		this.hairColor = hairColor;
	}

	public Human() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public byte getAge() {
		return age;
	}

	public void setAge(byte age) {
		this.age = age;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getEyesColor() {
		return eyesColor;
	}

	public void setEyesColor(String eyesColor) {
		this.eyesColor = eyesColor;
	}

	public String getHairColor() {
		return hairColor;
	}

	public void setHairColor(String hairColor) {
		this.hairColor = hairColor;
	}

	@Override
	public String toString() {
		return "imie " + this.getName() + "\nnazwisko " + this.getSurname() + "\nwiek" + this.getAge() + "\nwaga "
				+ this.getWeight() + "\nwysokosc " + this.getHeight() + "\nkolor oczu " + this.getEyesColor()
				+ "\nkolor wlosow " + this.getHairColor();
	}

}
