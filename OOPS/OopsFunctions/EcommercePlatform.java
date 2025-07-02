interface Taxable {
    double calculateTax();
    String getTaxDetails();
}


abstract class Product {
    private int productId;
    private String name;
    private double price;

   
    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

   
    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double calculateDiscount();

    public void displayDetails() {
        System.out.println("Product ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Price: ₹" + price);
        System.out.println("Discount: ₹" + calculateDiscount());
    }
}


class Electronics extends Product implements Taxable {
    private final double discountRate = 0.1; // 10%
    private final double taxRate = 0.18;     // 18%

    public Electronics(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * discountRate;
    }

    @Override
    public double calculateTax() {
        return (getPrice() - calculateDiscount()) * taxRate;
    }

    @Override
    public String getTaxDetails() {
        return "Electronics Tax (18%) = ₹" + calculateTax();
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println(getTaxDetails());
        System.out.println("------------------------");
    }
}


class Clothing extends Product implements Taxable {
    private final double discountRate = 0.2; // 20%
    private final double taxRate = 0.12;     // 12%

    public Clothing(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * discountRate;
    }

    @Override
    public double calculateTax() {
        return (getPrice() - calculateDiscount()) * taxRate;
    }

    @Override
    public String getTaxDetails() {
        return "Clothing Tax (12%) = ₹" + calculateTax();
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println(getTaxDetails());
        System.out.println("------------------------");
    }
}


class Groceries extends Product {
    private final double discountRate = 0.05; // 5%

    public Groceries(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * discountRate;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Tax: Exempted (Groceries)");
        System.out.println("------------------------");
    }
}


public class EcommercePlatform {
    public static void main(String[] args) {
        
        Product[] products = new Product[3];

        products[0] = new Electronics(1001, "Smartphone", 30000);
        products[1] = new Clothing(2002, "T-Shirt", 1500);
        products[2] = new Groceries(3003, "Rice 10kg", 800);

        
        for (Product p : products) {
            p.displayDetails();
        }
    }
}
