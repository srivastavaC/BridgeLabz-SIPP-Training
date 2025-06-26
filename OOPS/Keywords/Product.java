public class Product {
    private static double discount = 0.0; 
    private final String productID; 
    private String productName;
    private double price;
    private int quantity;

    
    public Product(String productID, String productName, double price, int quantity) {
        this.productID = productID; 
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    
    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

   
    public double calculateTotalPrice() {
        return (price * quantity) * (1 - discount / 100);
    }

    
    public void displayProductDetails() {
        if (this instanceof Product) { 
            System.out.println("Product ID: " + productID);
            System.out.println("Product Name: " + productName);
            System.out.println("Price: $" + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Total Price after Discount: $" + calculateTotalPrice());
        } else {
            System.out.println("This is not a valid Product instance.");
        }
    }

    public static void main(String[] args) {
        Product.updateDiscount(10.0); 

        Product product1 = new Product("P001", "Laptop", 1000.0, 2);
        product1.displayProductDetails();

        Product product2 = new Product("P002", "Smartphone", 500.0, 3);
        product2.displayProductDetails();
    }
}