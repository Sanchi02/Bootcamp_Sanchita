final class FlyingCar extends Car {
	double batteryCharge;

	FlyingCar(int regNum, String color, int seats, double price, int numOfGears, String model, double popularity, String placeManufactured, double batteryCharge) {
		super(regNum, color, seats, price, numOfGears, model, popularity, placeManufactured);
		this.batteryCharge = batteryCharge;
		System.out.println("In Flying() parametrized constructor");
	}

	void display() {
		super.display();
		System.out.println("Battery remaining : " + this.batteryCharge);
		System.out.println("###############################");
	}
	
	void batteryStatus() {
		if (this.batteryCharge < 30) {
			System.out.println("Battery low!! Please charge as soon as possible");
		}
		else
			System.out.println("Battery % remaining : " + this.batteryCharge);
	}		

}