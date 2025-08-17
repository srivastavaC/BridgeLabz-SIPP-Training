interface IVehicleRental {
    void rent();
    void returnVehicle();
}

class Car implements IVehicleRental {
    public void rent() {
        System.out.println("Car has been rented.");
    }
    public void returnVehicle() {
        System.out.println("Car has been returned.");
    }
}

class Bike implements IVehicleRental {
    public void rent() {
        System.out.println("Bike has been rented.");
    }
    public void returnVehicle() {
        System.out.println("Bike has been returned.");
    }
}

class Bus implements IVehicleRental {
    public void rent() {
        System.out.println("Bus has been rented.");
    }
    public void returnVehicle() {
        System.out.println("Bus has been returned.");
    }
}