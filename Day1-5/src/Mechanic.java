class Mechanic {
	public static void main(String[] args) {
		Bike bike1 = new Bike(2, "Black", "Yolo", 60.00, 4503, 0);
		bike1.details();
		bike1.inspect();
		bike1.drive();

		VehicleCar car1 = new VehicleCar(4, "Red", "Striker" , 70.00, 3069, 4);
		car1.details();
		car1.inspect();
		car1.drive();

	}
}