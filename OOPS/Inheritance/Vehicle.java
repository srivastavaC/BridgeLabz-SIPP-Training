class Vehicle {
	int maxSpeed;
	String fuelType;

	Vehicle(int maxSpeed, String fuelType) {
		this.maxSpeed = maxSpeed;
		this.fuelType = fuelType;
	}

	void displayInfo() {
		System.out.println("Max Speed: " + maxSpeed + " km/h");
		System.out.println("Fuel Type: " + fuelType);
	}
}

class Car extends Vehicle {
	int seatCapacity;

	Car(int maxSpeed, String fuelType, int seatCapacity) {
		super(maxSpeed, fuelType);
		this.seatCapacity = seatCapacity;
	}

	@Override
	void displayInfo() {
		System.out.println("Car Details:");
		super.displayInfo();
		System.out.println("Seat Capacity: " + seatCapacity);
		System.out.println("-----------------------------");
	}
}

class Truck extends Vehicle {
	int loadCapacity;

	Truck(int maxSpeed, String fuelType, int loadCapacity) {
		super(maxSpeed, fuelType);
		this.loadCapacity = loadCapacity;
	}

	@Override
	void displayInfo() {
		System.out.println("Truck Details:");
		super.displayInfo();
		System.out.println("Load Capacity: " + loadCapacity + " kg");
		System.out.println("-----------------------------");
	}
}

class Motorcycle extends Vehicle {
	boolean hasStorage;

	Motorcycle(int maxSpeed, String fuelType, boolean hasStorage) {
		super(maxSpeed, fuelType);
		this.hasStorage = hasStorage;
	}

	@Override
	void displayInfo() {
		System.out.println("Motorcycle Details:");
		super.displayInfo();
		System.out.println("Has Storage Box: " + (hasStorage ? "Yes" : "No"));
		System.out.println("-----------------------------");
	}

}
