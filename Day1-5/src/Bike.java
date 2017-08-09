class Bike extends Vehicle {
	int status; //1 if running else 0

	Bike() {
		status = 0;
	}

	Bike(int wheels, String color, String model, double speed, int vin, int status) {
		super(wheels, color, model, speed, vin);
		this.status = status;
	}
	void drive(){
		System.out.println("The Bike is running");
		this.status = 1;
	}

	void inspect() {
		if(status == 0) {
			System.out.println("The bike has stopped");
		}
		else 
			System.out.println("The bike is moving");
	}

	void brake() {
		System.out.println("The Bike has stopped");
		this.status = 0;
	}

	void details() {
		super.details();
		System.out.println("Status of the car : " + this.status);
	}
}