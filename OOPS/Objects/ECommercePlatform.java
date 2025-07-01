import java.util.ArrayList;
import java.util.List;

public class ECommercePlatform {

    
    static class Product {
        private String name;
        private double price;

        public Product(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }
    }

    
    static class Order {
        private int orderId;
        private List<Product> products;
        private Customer customer;

        public Order(int orderId, Customer customer) {
            this.orderId = orderId;
            this.customer = customer;
            this.products = new ArrayList<>();
        }

        public void addProduct(Product product) {
            products.add(product);
        }

        public void showOrderDetails() {
            System.out.println("Order ID: " + orderId);
            System.out.println("Customer: " + customer.getName());
            System.out.println("Products:");
            double total = 0.0;
            for (Product p : products) {
                System.out.println("- " + p.getName() + " : ₹" + p.getPrice());
                total += p.getPrice();
            }
            System.out.println("Total: ₹" + total);
        }
    }

    
    static class Customer {
        private String name;
        private List<Order> orders;

        public Customer(String name) {
            this.name = name;
            this.orders = new ArrayList<>();
        }

        public String getName() {
            return name;
        }

        public void placeOrder(Order order) {
            orders.add(order);
            System.out.println(name + " placed a new order with Order ID: " + order.orderId);
        }

        public void showAllOrders() {
            System.out.println("\nAll Orders of Customer: " + name);
            for (Order order : orders) {
                order.showOrderDetails();
                System.out.println("------------");
            }
        }
    }

    public static void main(String[] args) {
        
        Product p1 = new Product("Laptop", 75000);
        Product p2 = new Product("Smartphone", 25000);
        Product p3 = new Product("Mouse", 500);

       
        Customer c1 = new Customer("John Doe");

        
        Order o1 = new Order(101, c1);
        o1.addProduct(p1);
        o1.addProduct(p3);
        c1.placeOrder(o1);

        
        Order o2 = new Order(102, c1);
        o2.addProduct(p2);
        c1.placeOrder(o2);

        c1.showAllOrders();
    }
}
