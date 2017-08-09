class Bus extends Automobile {
	String type;

	Bus(int regNum, String color, int seats, double price, int numOfGears, String model, String type) {
		super(regNum, color, seats, price, numOfGears, model);
		this.type = type;
		System.out.println("In bus() parametrized constructor");
	}

	void display() {
		super.display();
		System.out.println("Type of the bus : " + this.type);
		System.out.println("###############################");

	}

}