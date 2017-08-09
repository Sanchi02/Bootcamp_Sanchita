final class SportsCar extends Car {
	double pickup;

	SportsCar(int regNum, String color, int seats, double price, int numOfGears, String model, double popularity, String placeManufactured, double pickup) {
		super(regNum, color, seats, price, numOfGears, model, popularity, placeManufactured);
		this.pickup = pickup;
		System.out.println("In Sports() parametrized constructor");
	}

	void display() {
		super.display();
		System.out.println("Pickup of the car : " + this.pickup);
		System.out.println("###############################");
	}

}