class Automobile {
	int regNum;
	String color;
	int seats;
	double price;
	int numOfGears;
	String model;
	static int numItemsInventory = 0;

	void Automobile() {
		System.out.println("In automobile default constructor");	
	}
 
	Automobile(int regNum, String color, int seats, double price, int numOfGears, String model) {
		this.regNum = regNum;
		this.color = color;
		this.seats = seats;
		this.price = price;
		this.numOfGears = numOfGears;
		this.model = model;
		this.numItemsInventory += 1;
		System.out.println("In AutoMobile constructor");
	}
	
	void display() {
		System.out.println("Registration Number : " + this.regNum);
		System.out.println("Color of the car : " + this.color);
		System.out.println("Seats available : " + this.seats);
		System.out.println("Price" + this.price);
		System.out.println("Number of gears available : " + this.numOfGears);
		System.out.println("Model : " + this.model);
	}

	final void updateRegNum(int regNum) {
		this.regNum = regNum;
	}

	void updatePrice(double price) {
		this.price = price;
	}
}