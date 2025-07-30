import java.util.*;
class Item<T> {
    String itemName;
    int quantity;
    double pricePerUnit;
    T category;  

    Item(String itemName, int quantity, double pricePerUnit, T category) {
        this.itemName = itemName;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
        this.category = category;
    }

    double getTotalPrice() {
        return quantity * pricePerUnit;
    }

    public String toString() {
        return "Item: " + itemName + ", Qty: " + quantity + ", Price/Unit: " + pricePerUnit +
               ", Category: " + category + ", Total: ₹" + getTotalPrice();
    }
}


class ShoppingCart<T> {
    private List<Item<T>> itemList = new ArrayList<>();
    private Set<String> itemNames = new HashSet<>();

    
    public void addItem(String name, int quantity, double price, T category) {
        if (itemNames.contains(name.toLowerCase())) {
            System.out.println("Item already in cart: " + name);
            return;
        }
        Item<T> item = new Item<>(name, quantity, price, category);
        itemList.add(item);
        itemNames.add(name.toLowerCase());
        System.out.println("Added to cart: " + name);
    }

  
    public double calculateTotal() {
        double total = 0;
        for (Item<T> item : itemList) {
            total += item.getTotalPrice();
        }
        return total;
    }

    // Display all items
    public void showCart() {
        if (itemList.isEmpty()) {
            System.out.println("Cart is empty.");
        } else {
            System.out.println("Items in Cart:");
            for (Item<T> item : itemList) {
                System.out.println(item);
            }
        }
    }
}

public class Billing {
    public static void main(String[] args) {
        ShoppingCart<String> cart = new ShoppingCart<>();

        
        cart.addItem("Milk", 2, 25.5, "Grocery");
        cart.addItem("Shirt", 1, 599.99, "Clothing");
        cart.addItem("Phone", 1, 14999.0, "Electronics");
        cart.addItem("Milk", 1, 25.5, "Grocery"); 

        System.out.println();
        cart.showCart();

        System.out.println("\nTotal Cart Value: ₹" + cart.calculateTotal());
    }
}
