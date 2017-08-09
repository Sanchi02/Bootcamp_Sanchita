abstract class Vehicle {
	int wheels;
	String color;
	String model;
	double speed;
	int vin;

	Vehicle() {

	}

	Vehicle(int wheels, String color, String model, double speed, int vin) {
		this.vin = vin;
		this.wheels = wheels;
		this.color = color;
		this.model = model;
		this.speed = speed;
	}

	abstract void drive();

	abstract void inspect(); 

	void details() {
		System.out.println("Vehicle Identification number : " + this.vin);
		System.out.println("Number of wheels : " + this.wheels);
		System.out.println("Color of the vehicle : " + this.color);
		System.out.println("Model name : " + this.model);
		System.out.println("Speed of the vehicle : " + this.speed);
	}	
}