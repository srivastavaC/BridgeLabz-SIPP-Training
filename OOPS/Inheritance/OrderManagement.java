import java.time.LocalDate;

class Order {
    String orderId;
    LocalDate orderDate;

    Order(String orderId, LocalDate orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    String getOrderStatus() {
        return "Order placed";
    }

    void displayDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Order Date: " + orderDate);
    }
}

class ShippedOrder extends Order {
    String trackingNumber;

    ShippedOrder(String orderId, LocalDate orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    String getOrderStatus() {
        return "Order shipped, Tracking Number: " + trackingNumber;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Tracking Number: " + trackingNumber);
    }
}

class DeliveredOrder extends ShippedOrder {
    LocalDate deliveryDate;

    DeliveredOrder(String orderId, LocalDate orderDate, String trackingNumber, LocalDate deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    String getOrderStatus() {
        return "Order delivered on " + deliveryDate;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Delivery Date: " + deliveryDate);
    }
}
public class OrderManagement {
    public static void main(String[] args) {
        Order order = new Order("ORD123", LocalDate.now());
        order.displayDetails();
        System.out.println("Status: " + order.getOrderStatus());
        System.out.println("-----------------------------");

        ShippedOrder shippedOrder = new ShippedOrder("ORD124", LocalDate.now(), "TRK456");
        shippedOrder.displayDetails();
        System.out.println("Status: " + shippedOrder.getOrderStatus());
        System.out.println("-----------------------------");

        DeliveredOrder deliveredOrder = new DeliveredOrder("ORD125", LocalDate.now(), "TRK789", LocalDate.now().plusDays(2));
        deliveredOrder.displayDetails();
        System.out.println("Status: " + deliveredOrder.getOrderStatus());
    }
}