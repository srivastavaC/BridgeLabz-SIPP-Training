import java.util.*;
class Order<T> {
    T category;
    String itemName;
    int quantity;

    public Order(T category, String itemName, int quantity) {
        this.category = category;
        this.itemName = itemName;
        this.quantity = quantity;
    }

    public T getCategory() {
        return category;
    }

    public String getItemName() {
        return itemName;
    }

    public int getQuantity() {
        return quantity;
    }

    public String toString() {
        return "Order: " + itemName + " | Qty: " + quantity + " | Category: " + category;
    }
}


class OrderManager<T> {
    private Queue<Order<T>> orderQueue = new LinkedList<>();

    
    public void addOrder(T category, String itemName, int quantity) {
        Order<T> newOrder = new Order<>(category, itemName, quantity);
        orderQueue.add(newOrder);
        System.out.println("Order added: " + itemName);
    }

   
    public void deliverOrder() {
        if (orderQueue.isEmpty()) {
            System.out.println("No orders to deliver.");
        } else {
            Order<T> delivered = orderQueue.poll();
            System.out.println("Delivered: " + delivered);
        }
    }

    
    public void filterByCategory(T category) {
        System.out.println("Orders in category: " + category);
        for (Order<T> order : orderQueue) {
            if (order.getCategory().equals(category)) {
                System.out.println(order);
            }
        }
    }

    
    public void showAllOrders() {
        if (orderQueue.isEmpty()) {
            System.out.println("No current orders.");
        } else {
            for (Order<T> order : orderQueue) {
                System.out.println(order);
            }
        }
    }
}


public class Bakery {
    public static void main(String[] args) {
        
        OrderManager<String> manager = new OrderManager<>();

      
        manager.addOrder("Cake", "Chocolate Cake", 1);
        manager.addOrder("Pastry", "Strawberry Pastry", 2);
        manager.addOrder("Cookie", "Choco Chip", 5);
        manager.addOrder("Cake", "Vanilla Cake", 1);

        System.out.println("\n--- All Orders ---");
        manager.showAllOrders();

        System.out.println("\n--- Delivering Orders ---");
        manager.deliverOrder();  
        manager.deliverOrder();

        System.out.println("\n--- Remaining Orders ---");
        manager.showAllOrders();

        System.out.println("\n--- Filter by Category: Cake ---");
        manager.filterByCategory("Cake");
    }
}
