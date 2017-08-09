class Dealer {
	public static void main(String[] args) {
		Bus b1 = new Bus(1061, "Red", 50, 70000, 10, "Techno" , "Transport");
		Bus b2 = new Bus(1068, "Black", 15, 180000, 12, "Star" , "Luxury");
		FlyingCar f1 = new FlyingCar(3045, "Blue", 4, 200000, 5, "Flyo1", 80.1 , "Germany" , 60);
		FlyingCar f2 = new FlyingCar(3020, "Yellow", 5, 190500, 4, "Supa", 60.4 , "India" , 20);
		SportsCar s1 = new SportsCar(5903, "Red", 2, 400000, 15, "Striker", 86.5, "Australia", 90);
		SportsCar s2 = new SportsCar(5968, "Green", 1, 420000, 12, "Metador", 90.2, "Canada", 95);

		System.out.println("*******************************");
		System.out.println("Welcome to the ABC Dealers");
		System.out.println("*******************************");
		System.out.println("Presenting our inventory");
		System.out.println("===============================");
		System.out.println("Our Buses available are : ");
		b1.display();
		b2.display();
		System.out.println("===============================");
		System.out.println("Our Sports car available are : ");
		s1.display();
		s2.display();
		System.out.println("===============================");
		System.out.println("Our Flying available are : ");
		f1.display();
		f2.display();
		System.out.println("Checking battery status for the flying cars");
		f1.batteryStatus();
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		f2.batteryStatus();
		System.out.println("Total number of items in the inventory are : " + s2.numItemsInventory);
	}
	
}