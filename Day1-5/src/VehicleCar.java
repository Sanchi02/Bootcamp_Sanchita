class VehicleCar extends Vehicle {

	int airBags;

	VehicleCar(int wheels, String color, String model, double speed, int vin, int airBags) {
		super(wheels, color, model, speed, vin);
		this.airBags = airBags;
		
	}

	void inspect() {
		if(this.speed < 10) {
			System.out.println("The car is about to stop");
		}
		else if(this.speed < 70){
			System.out.println("The car is running at a good speed");
		}
		else if(this.speed > 70) {
			System.out.println("The car is running very fast. Please slow down!!");
		}
	}

	void drive() {
		System.out.println("The Car is running");
	}

	void details() {
		super.details();
		System.out.println("Number of airBags : " + this.airBags);
	}
}