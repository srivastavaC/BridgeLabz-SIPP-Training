public class Car {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private static final double DAILY_RATE = 50.0;

    
    public Car() {
        this.customerName = "Unknown";
        this.carModel = "Unknown";
        this.rentalDays = 1;
    }

    
    public Car(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

   
    public double calculateTotalCost() {
        return rentalDays * DAILY_RATE;
    }

    
    public void displayRentalDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: $" + calculateTotalCost());
    }
}
