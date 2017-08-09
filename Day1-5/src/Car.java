class Car extends Automobile {
	double popularity;
	String placeManufactured;

	Car(int regNum, String color, int seats, double price, int numOfGears, String model, double popularity, String placeManufactured) {
		super(regNum, color, seats, price, numOfGears, model);
		this.popularity = popularity;
		this.placeManufactured = placeManufactured;
		System.out.println("In Car() parametrized constructor");
	}

	void display() {
		super.display();
		System.out.println("Popularity of the car : " + this.popularity);
		System.out.println("Place where the car is manufactured : " + placeManufactured);

	}

	void changePopularity(double popularity) {
		System.out.println("Popularity has been changed from" + this.popularity + " to " + popularity);
		this.popularity = popularity;
	}
}