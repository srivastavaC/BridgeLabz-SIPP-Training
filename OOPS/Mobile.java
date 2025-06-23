public class Mobile {
    String brand;
    String model;
    double price;
    public Mobile(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }   
}

class MobileDemo {
    public static void main(String[] args) {
        Mobile mobile = new Mobile("Samsung", "Galaxy S21", 799.99);
        mobile.displayDetails();
    }
}